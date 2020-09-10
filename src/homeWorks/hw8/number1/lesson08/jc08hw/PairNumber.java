package homeWorks.hw8.number1.lesson08.jc08hw;

import java.util.Scanner;

public class PairNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  number = scanner.nextLine();
        if(number.matches("^[-,0-9]*$")) {
            int z = Integer.parseInt(number);
            if (z % 2 == 0) {
                System.out.println("Є парне");
            } else {
                System.out.println("Не є парне");
            }
        }else System.out.println("Ви ввели погане значення");

    }








}
