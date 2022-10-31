import java.io.Serializable;

public class Dog implements Serializable {
    int age;
    String breed;
    String foodToEatBest;

    public Dog(int age, String breed, String foodToEatBest) {
        this.age = age;
        this.breed = breed;
        this.foodToEatBest = foodToEatBest;
    }
}
