package homeWorks.hw8.number1.lesson08.hwjavacore08.number3;

import java.util.Scanner;

public class SymNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a number1");
        Scanner scan1 = new Scanner(System.in);
        try {

            double number1 = scan1.nextDouble();

        System.out.println("Please enter a number2");
        Scanner scan2 = new Scanner(System.in);
        double number2 = scan2.nextDouble();
            if (number1 % 1 == 0 & number2 % 1 == 0) {
            System.out.println("Sym = " + (number1+number2));
        }
        else {
            System.out.println("These numbers are incorrect");
        }
        }
        catch( Exception e){
            System.out.println("Invalid number entered");
        }

    }
}
