package homeWorks.hw4.number2;

public class Kermo {
    private int diametr;
    private String tupKerma;

    public Kermo() {
        this.diametr = 8;
        this.tupKerma = "Shkira";
    }

    public Kermo(int diametr, String tupKerma) {
        this.diametr = diametr;
        this.tupKerma = tupKerma;
    }

    private int sizeKermo(int diametr){
        this.diametr = diametr*2;
        return diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public String getTupKerma() {
        return tupKerma;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void setTupKerma(String tupKerma) {
        this.tupKerma = tupKerma;
    }

    @Override
    public String toString() {
        return "Kermo{" +
                "diametr=" + diametr +
                ", tupKerma='" + tupKerma + '\'' +
                '}';
    }
}
