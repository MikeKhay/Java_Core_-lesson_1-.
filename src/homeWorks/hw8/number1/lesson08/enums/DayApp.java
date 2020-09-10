package homeWorks.hw8.number1.lesson08.enums;

public class DayApp {

    public static void main(String[] args) {

        WeekDay weekDay = WeekDay.MONDAY;

        System.out.println(weekDay.name());
        System.out.println(weekDay.ordinal());
        System.out.println(WeekDay.THURSDAY.ordinal());

        System.out.println("2");
        System.out.println(weekDay.toString());

        System.out.println(weekDay.equals(WeekDay.FRIDAY));
        System.out.println(weekDay.compareTo(WeekDay.SATURDAY));

        System.out.println("3");

        System.out.println(weekDay.getDeclaringClass());

        WeekDay value = WeekDay.valueOf("WEDNESDAY");
        System.out.println(value.ordinal());


        System.out.println("4");

        System.out.println(weekDay.getType());
        System.out.println(weekDay.getUaName());

        WeekDay[] days = WeekDay.values();

        for (WeekDay day : days) {
            System.out.println(day);
        }


    }
}
