import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {1, 4, 8, 9, 14, 209, 466};
            System.out.println(array[14]);
        } catch (IndexOutOfBoundsException exception){
            System.out.println("Тут ошибка");
        }
        Person oldPerson = new Person(67);
        Person youngPerson = new Person(6);
        Person young2 = new Person(62);
    }
}