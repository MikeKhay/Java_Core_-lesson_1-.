package homeWorks.hw4.number3;

public class App {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leopard",80,7);
        System.out.println("Назва тварини = "+ animal1.getName() +
                " , Швидкість тварини = "+ animal1.getSpeed() +
                " км/год, Вік тварини = "+ animal1.getAge() + " років");


        animal1.setName("Cat");
        animal1.setSpeed(12);
        animal1.setAge(3);
        System.out.println("Назва тварини = "+ animal1.getName() +
                " , Швидкість тварини = "+ animal1.getSpeed() +
                " км/год, Вік тварини = "+ animal1.getAge() + " років");

    }
}
