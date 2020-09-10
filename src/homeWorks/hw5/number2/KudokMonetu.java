package homeWorks.hw5.number2;

import java.util.Random;

public class KudokMonetu {
    public static void main(String[] args) {
        double a = Math.random();
        if(a<0.5){
            System.out.println("Випав орел!!!");
        }
        else {
            System.out.println("Випала решка!!!");
        }
    }
}
