package homeWorks.hw8.number1.lesson08.enums;

import static homeWorks.hw8.number1.lesson08.enums.DayType.WEEKEND;
import static homeWorks.hw8.number1.lesson08.enums.DayType.WORK_DAY;

public enum WeekDay {

    MONDAY("Понеділок", WORK_DAY),
    TUESDAY("Вівторок", WORK_DAY),
    WEDNESDAY("Середа", WORK_DAY),
    THURSDAY("Четвер", WORK_DAY),
    FRIDAY("П'ятниця", WORK_DAY),
    SATURDAY("Субота", WEEKEND),
    SUNDAY("Неділя", WEEKEND);

    private String uaName;
    private DayType type;

    public String getUaName() {
        return uaName;
    }

    public DayType getType() {
        return type;
    }

    WeekDay(String uaName, DayType type) {
        this.type = type;
        this.uaName = uaName;
    }
}
