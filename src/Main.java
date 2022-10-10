import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуская метод intArray");
        int[] array = new int[10];
        array = arrayPull(array);
        System.out.println(Arrays.toString(array));
        Calculator calc = new Calculator(100, 25, "red");
        System.out.println("Сумма двух чисел = " + calc.sumCalculator(6, 8));
        System.out.println("Разность двух чисел = " + calc.difference(6, 8));
        System.out.println("Деление двух чисел = " + calc.division(6, 8));
        System.out.println("Умножение двух чисел = " + calc.multiplication(6, 8));
        System.out.println("калькулятор весом: " + calc.weight + ";" + " " + "стоимостью:" + calc.cost + ";" + " " + "цвет:" + calc.color);
    }

    public static int[] arrayPull(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = (int) (Math.random() * 100);
        }
        return someArray;
    }
}