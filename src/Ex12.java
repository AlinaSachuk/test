import java.io.*;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write some line");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/alina/Documents//newText12.txt");
        String line = scanner.nextLine(); //byte [] buffer = scanner.nextLine().getBytes;
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
        Dog dog = new Dog(8, "Dog", "beef");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/alina/Documents//Dog.txt"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/alina/Documents//Dog.txt"));
        Dog dogRestored = (Dog)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(dogRestored.age + "years. " + "Breed " + dogRestored.breed + ". Lovely food - " + dogRestored.foodToEatBest);
    }
}
