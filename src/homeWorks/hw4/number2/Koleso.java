package homeWorks.hw4.number2;

public class Koleso {
    private int diamert;
    private String tupKolesa;

    public Koleso() {
        this.diamert = 17;
        this.tupKolesa = "Shtampovka";
    }

    public Koleso(int diamert, String tupKolesa) {
        this.diamert = diamert;
        this.tupKolesa = tupKolesa;
    }

    private int sizeKoleso(int diamert){
        this.diamert =(diamert*2);
        return diamert;
    }

    public int getDiamert() {
        return diamert;
    }

    public String getTupKolesa() {
        return tupKolesa;
    }

    public void setDiamert(int diamert) {
        this.diamert = diamert;
    }

    public void setTupKolesa(String tupKolesa) {
        this.tupKolesa = tupKolesa;
    }

    @Override
    public String toString() {
        return "Koleso{" +
                "diamert=" + diamert +
                ", tupKolesa='" + tupKolesa + '\'' +
                '}';
    }
}
