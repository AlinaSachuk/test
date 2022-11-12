import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Ex14 {
    public static void main(String[] args) {
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
        System.out.println(lambda2.numbersToCompare(4, 4));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your date of birth in format: year + month + day");
        LocalDate dateOfBirth = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(dateOfBirth.plusYears(18));
    }
}
