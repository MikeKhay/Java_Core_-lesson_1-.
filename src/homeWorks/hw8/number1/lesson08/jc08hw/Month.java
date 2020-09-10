package homeWorks.hw8.number1.lesson08.jc08hw;


import static homeWorks.hw8.number1.lesson08.jc08hw.Seasons.*;

public enum Month {
    JANUARY(WINTER, 31),
    FEBRUARY(WINTER, 28),
    MARCH(SPRING, 31),
    APRIL(SPRING, 30),
    MAY(SPRING, 31),
    JUNE(SUMMER, 30),
    JULY(SUMMER, 31),
    AUGUST(SUMMER, 31),
    SEPTEMBER(AUTUMN, 30),
    OCTOBER(AUTUMN, 31),
    NOVEMBER(AUTUMN, 30),
    DECEMBER(WINTER, 31);
    protected Seasons seasons;
    protected int days;

    public Seasons getSeasons() {
        return seasons;
    }

    public int getDays() {
        return days;
    }

    Month(Seasons seasons, int days) {
        this.seasons = seasons;
        this.days = days;
    }
}



