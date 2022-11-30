import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        for (int i = 0; i < 1; i++){
            Thread thread = new Thread(new Ex19());
            thread.start();
            thread.join();
        }
        System.out.println("The end!");
        Thread thread2 = new Thread(new Ex19());
        thread2.setDaemon(true);
        thread2.start();
        System.out.println("Final");
    }
}