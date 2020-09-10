package homeWorks.hw4.number2;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());

        Car car1 = new Car(
                new Kythov("Metal","Yniversal"),
                new Kermo(11,"Zamsha"),
                new Koleso(18,"Leghosplavne")
        );
        System.out.println(car1.toString());

    }
}
