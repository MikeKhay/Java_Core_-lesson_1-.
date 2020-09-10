package homeWorks.hw3.number2;

public class Kolo {
    private double diameter;
    private double radiu;

    public Kolo(double radiu) {
        this.diameter = radiu*2;
        this.radiu = radiu;
    }

    public void ploscha(){
        System.out.println("Plosch Kola: " + (Math.PI *(2/(radiu*radiu))));
    }

    public void dovgyna(){
        System.out.println("Dovgyna Kola: " + (2*Math.PI*radiu));
    }
}
