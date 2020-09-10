package homeWorks.hw7;

import java.util.Random;

public abstract class Litak {
    private int dovjuna;
    private int shuruna;
    private int vaga;

    public Litak(int dovjuna, int shuruna, int vaga) {
        this.dovjuna = dovjuna;
        this.shuruna = shuruna;
        this.vaga = vaga;
    }

    Random random = new Random();

    public void zapyskDvugyna(){
        System.out.println("До взльоту залишилось: " + (20+random.nextInt(68))+" c.");
    }
    public void vzlitLitaka(){
        System.out.println("Літак пролетить на повному баку: " + random.nextInt(1000) +" км.");
    }
    public void posadkaLitaka(){
        System.out.println("Літак іде на посадку!!!");
    }
}
