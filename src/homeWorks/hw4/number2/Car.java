package homeWorks.hw4.number2;

public class Car {
    private Kythov kythov;
    private Kermo kermo;
    private Koleso koleso;

    public Car() {
        this.kythov = new Kythov();
        this.kermo = new Kermo();
        this.koleso = new Koleso();
    }

    public Car(Kythov kythov, Kermo kermo, Koleso koleso) {
        this.kythov = kythov;
        this.kermo = kermo;
        this.koleso = koleso;
    }

    public Kythov getKythov() {
        return kythov;
    }

    public Kermo getKermo() {
        return kermo;
    }

    public Koleso getKoleso() {
        return koleso;
    }

    public void setKythov(Kythov kythov) {
        this.kythov = kythov;
    }

    public void setKermo(Kermo kermo) {
        this.kermo = kermo;
    }

    public void setKoleso(Koleso koleso) {
        this.koleso = koleso;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kythov=" + kythov +
                ", kermo=" + kermo +
                ", koleso=" + koleso +
                '}';
    }
}
