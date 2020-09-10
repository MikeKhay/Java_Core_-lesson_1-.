package homeWorks.hw8.number1;

import static homeWorks.hw8.number1.Season.*;

public enum Month {
    JANUARY(31,WINTER),
    FEBRUARY(28,WINTER),
    MARCH(31,SPRING),
    APRIL(30,SPRING),
    MAY(31,SPRING),
    JUNE(30,SUMMER),
    JULE(31,SUMMER),
    AUGUST(30,SUMMER),
    SEPTEMBER(31,AUTUMN),
    OCTOBER(30,AUTUMN),
    NOVEMBER(31,AUTUMN),
    DECEMBER(30,WINTER);

    private int day;
    private Season season;

    Month(int day, Season season) {
        this.day = day;
        this.season = season;
    }

    public int getDay() {
        return day;
    }

    public Season getSeason() {
        return season;
    }
}
