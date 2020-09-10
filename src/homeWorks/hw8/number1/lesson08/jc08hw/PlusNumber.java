package homeWorks.hw8.number1.lesson08.jc08hw;

import java.util.Scanner;

public class PlusNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
       if(number1.matches("^[-,0-9]*$") & number2.matches("^[-,0-9]*$")){
           int z = Integer.parseInt(number1) + Integer.parseInt(number2);
           System.out.println(z);
       }else System.out.println("Ви ввели погане значення");



    }
}
