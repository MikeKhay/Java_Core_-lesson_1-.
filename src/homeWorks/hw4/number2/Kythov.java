package homeWorks.hw4.number2;

public class Kythov {
    private String metalKythova;
    private String tupKythova;

    public Kythov() {
        this.metalKythova = "Aluyminiy";
        this.tupKythova = "Sedan";
    }

    public Kythov(String metalKythova, String tupKythova) {
        this.metalKythova = metalKythova;
        this.tupKythova = tupKythova;
    }

    public String getMetalKythova() {
        return metalKythova;
    }

    public String getTupKythova() {
        return tupKythova;
    }

    public void setMetalKythova(String metalKythova) {
        this.metalKythova = metalKythova;
    }

    public void setTupKythova(String tupKythova) {
        this.tupKythova = tupKythova;
    }

    @Override
    public String toString() {
        return "Kythov{" +
                "metalKythova='" + metalKythova + '\'' +
                ", tupKythova='" + tupKythova + '\'' +
                '}';
    }
}
