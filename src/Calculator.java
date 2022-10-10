public class Calculator {
    int weight;
    int cost;
    String color;
    public Calculator (){
    }

    public Calculator(int weight, int cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    {
        System.out.println("Cоздается объект Calculator");
    }
    int sumCalculator (int x, int y){
        return (x + y);
    }
    int difference (int x, int y){
        return (x - y);
    }
    int division (int x, int y){
        return (x / y);
    }
    int multiplication (int x, int y){
        return (x * y);
    }
    void getAllInfo (){
        System.out.println(weight + " " + cost + " " + color);
    }
}
