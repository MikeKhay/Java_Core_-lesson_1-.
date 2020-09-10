package homeWorks.hw6.number1;

public class ClockWorked implements Salary {

    int i;
    int a;

    public ClockWorked(int i) {
        this.i = i;
    }

    @Override
    public void salary() {
        System.out.println("Працівник заробив: " + (a = this.i*20) +"$");
    }
}
