import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17 {
    public static void main(String[] args) {
        String line = "Today my 17th lesson. I'm the best 1! Find me in inst: @teachmeskills";
        System.out.print("написать метод, который сможет вернуть все цифры из строки: ");
        System.out.println(firstMethod(line));
        System.out.println("написать метод, который сможет заменить КАЖДУЮ букву на знак & в строке из 1-го задания: ");
        Pattern pattern = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher.replaceAll("&"));
        System.out.print("написать метод, который сможет вернуть инсту в строке из задания 1: ");
        System.out.println(thirdMethod(line));
        System.out.print("написать метод, который возвращает true, если строка имеет вид null: ");
        System.out.println(fourthMethod(line));
        System.out.print("в строке заменить слэш+n на кавычки двойные используя классы паттерн и матчер: ");
        String line2 = "Hello \n world \n !!!";
        Pattern pattern2 = Pattern.compile("\n");
        Matcher matcher2 = pattern2.matcher(line2);
        System.out.println(matcher2.replaceAll(""));
        String line3 = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills";
        System.out.println(fifthMethod(line3));
    }

    static ArrayList<Integer> firstMethod(String text) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(text);
        ArrayList<Integer> resultList = new ArrayList<>();
        while (matcher.find()) {
            resultList.add(Integer.parseInt(matcher.group()));
        }
        return resultList;
    }
    static String thirdMethod(String text) {
        Pattern pattern = Pattern.compile("@[A-z]+");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        return matcher.group();
    }
    static boolean fourthMethod (String str){
        Pattern pattern = Pattern.compile("null");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    static String fifthMethod (String text) {
        Pattern pattern = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        return matcher.group();
    }
}

