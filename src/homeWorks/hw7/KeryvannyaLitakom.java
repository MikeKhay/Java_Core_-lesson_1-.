package homeWorks.hw7;

import java.util.Random;

public class KeryvannyaLitakom {

    Random random = new Random();

    public void ryhVverh(){
        System.out.println("Літак пролетів вверх: " + random.nextInt(1000)+" км.");
    }

    public void ryhVnuz(){
        System.out.println("Літак пролетів вниз: " + random.nextInt(1000)+" км.");
    }

    public void ryhVpered(){
        System.out.println("Літак пролетів вперед: " + random.nextInt(1000)+" км.");
    }

    public void ryhNazad(){
        System.out.println("Літак пролетів назад: " + random.nextInt(1000)+" км.");
    }
}
