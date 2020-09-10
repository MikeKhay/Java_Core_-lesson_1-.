package homeWorks.hw8.number1.lesson08.hwjavacore08.number2;


import java.util.Scanner;

public class NumberAnaliz {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);

        try {
            double number = scan.nextDouble();

            if (number % 1 == 0) {
                if (number % 2 == 0) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Not an even number");
                }
            } else {
                System.out.println("This number is fractional");
            }
        }
         catch( Exception e){
                System.out.println("Помилка тру кетч");
            }
    }
}
