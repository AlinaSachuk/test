import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write your date of birth in format: year + month + day");
//        LocalDate dateOfBirth = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
//        System.out.println(dateOfBirth.plusYears(18));
//        System.out.println("Your date of birth");
//        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(date.plusYears(18));
        Compare lambda = (a, b) -> {
            if (a > b) {
                return a;
            } else if (b > a) {
                return b;
            } else {
                return 0;
            }
        };
        System.out.println(lambda.numbersToCompare(4, 6));
        Compare lambda2 = (a, b) -> (a > b) ? a : ((a == b) ? 0 : b);
        System.out.println(lambda2.numbersToCompare(4,4));
    }
}
