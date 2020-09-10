package homeWorks.hw7;

import java.util.Random;

public class Sy27 extends Litak implements SpecialniMogluvosti {
    private int maxSpid;
    private String color;
    private KeryvannyaLitakom keryvannyaLitakom = new KeryvannyaLitakom();

    public Sy27(int dovjuna, int shuruna, int vaga, int maxSpid, String color) {
        super(dovjuna, shuruna, vaga);
        this.maxSpid = maxSpid;
        this.color = color;

    }

    public Sy27(int dovjuna, int shuruna, int vaga) {
        super(dovjuna, shuruna, vaga);
    }


    public void ryhVverh(){keryvannyaLitakom.ryhVverh();}
    public void ryhVnuz(){keryvannyaLitakom.ryhVnuz();}
    public void ryhVpered(){keryvannyaLitakom.ryhVpered(); }
    public void ryhNazad(){keryvannyaLitakom.ryhNazad();}

    Random random = new Random();

    @Override
    public void tyrboPruskorennya() {
        System.out.println("Турбо прискорення активовано швидкість: " + (maxSpid+(random.nextInt(500))) + " км/год");
    }

    @Override
    public void texnologiyaStels() {
        System.out.println("Технологія Стелс активована. Літак не видно: "+ random.nextInt(500) + " с.");
    }

    @Override
    public void yadernuyYdar() {

    }

}
