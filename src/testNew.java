import java.util.Arrays;
import java.util.Random;

public class testNew {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int indexLine = 0;
        int indexElement = 0;
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= maxValue) {
                    maxValue = array[i][j];
                    indexLine = i;
                    indexElement = j;
                }
            }
        }
        array[indexLine][indexElement] = 111;
        System.out.println("линия" + indexLine);
        System.out.println("Элемент" + indexElement);
        System.out.println(array[indexLine][indexElement]);
        System.out.println("сумма элементов главной диагонали");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("сумма:" + sum);
        System.out.println("сумма элементов побочной диагонали");
        int sumP = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == (array.length - 1)) {
                    sumP = sumP + array[i][j];
                }
            }
        }
        System.out.println("сумма:" + sumP);
        System.out.println("Зубчатый трехмерный массив (от 3 уровней)+количество ячеек в нем");
        int[][][] arrayZ = {{{1, 2, 3}, {6, 7}}, {{12, 45, 89, 23}}};
        int counter = 0;
        for (int i = 0; i < arrayZ.length; i++) {
            for (int j = 0; j < arrayZ[i].length; j++) {
                for (int k = 0; k < arrayZ[i][j].length; k++) {
                    System.out.print(arrayZ[i][j][k] + " ");
                    counter++;
                }
            }
        }
        System.out.println();
        System.out.println(counter);
        System.out.println(Arrays.deepToString(arrayZ));
        System.out.println("трехмерный массив с циклом for each");
        int[][][] testArray = {{{1, 2, 3}, {10, 20, 30, 40}}, {{500, 600}}};
        for (int[][] arrayMiddle : testArray) {
            for (int[] arrayInternal : arrayMiddle) {
                for (int item : arrayInternal) {
                    System.out.println(item + " ");
                }
                System.out.println();
            }
        }
    }
}
