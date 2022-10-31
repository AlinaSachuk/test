import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write some line");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/alina/Documents//newText12.txt");
        String line = scanner.nextLine();
        byte[] buffer = line.getBytes();
        fileOutputStream.write(buffer);
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("/Users/alina/Documents//newText12.txt");
        StringBuilder result = new StringBuilder();
        int i = - 1;
        while ((i = fileInputStream.read()) != - 1){
            result.append((char)i);
        }
        fileInputStream.close();
        System.out.println(result.toString().replace(" ", "_"));
    }
}
