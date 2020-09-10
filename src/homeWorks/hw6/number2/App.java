package homeWorks.hw6.number2;

public class App {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(10,20,15,10,20,18,30,5);
        System.out.println(myCalculator.plus());
        System.out.println(myCalculator.minus());
        System.out.println(myCalculator.devide());
        System.out.println(myCalculator.multiply());

    }
}
