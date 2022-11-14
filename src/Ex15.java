import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.setName("Willy");
        Optional<String> userOptional = Optional.ofNullable(user.getName());
        userOptional.ifPresentOrElse(
                x-> System.out.println(x),
                ()-> {
                    user.setName(scanner.nextLine());
                   System.out.println(user.getName());
                }
        );
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(1);
        numbers.add(1);
        numbers.add(12);
        numbers.add(2);
        numbers.add(7);
        numbers.stream().distinct().filter(num -> (num % 2 == 0) && (num > 6) && (num < 18)).map(x -> x * 2).sorted().limit(4).forEach(System.out::println);
    }
}
