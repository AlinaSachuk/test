public class PersonEx13 {
    String name;
    int age;

    public PersonEx13(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
