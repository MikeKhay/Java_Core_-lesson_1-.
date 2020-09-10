package homeWorks.hw6.number1;

public class MonthWorked implements Salary {

    boolean a;

    public MonthWorked(boolean a) {
        this.a = a;
    }

    @Override
    public void salary() {
        if(a==true){
            System.out.println("Працівник заробив: 3000$");
        }
        else {
            System.out.println("Працівник заробив 2000");
        }
    }
}
