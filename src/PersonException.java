public class PersonException extends ArithmeticException {
    int age;

    public PersonException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "You entered age " + age + " You need to be older";
    }
}
