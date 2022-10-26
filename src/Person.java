public class Person {
    private int age;

    public Person(int age) throws PersonException {
        if (age < 18) {
            throw new PersonException(age);
        }
        this.age = age;
        System.out.println("Your age is: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
