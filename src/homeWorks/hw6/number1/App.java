package homeWorks.hw6.number1;

public class App {
    public static void main(String[] args) {
        ClockWorked clockWorked = new ClockWorked(170);
        MonthWorked monthWorked = new MonthWorked(true);

        clockWorked.salary();
        monthWorked.salary();
    }
}
