package homeWorks.hw3.number1;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.perimetr();
        System.out.println();

        Rectangle rectangle1 = new Rectangle(20,30);
        rectangle1.area();
        rectangle1.perimetr();
    }
}
