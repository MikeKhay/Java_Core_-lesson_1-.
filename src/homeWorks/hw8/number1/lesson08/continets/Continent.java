package homeWorks.hw8.number1.lesson08.continets;


import static homeWorks.hw8.number1.lesson08.continets.HorizontalDirection.EAST;
import static homeWorks.hw8.number1.lesson08.continets.HorizontalDirection.WEST;
import static homeWorks.hw8.number1.lesson08.continets.VerticalDirection.NORTH;
import static homeWorks.hw8.number1.lesson08.continets.VerticalDirection.SOUTH;

public enum Continent {

    AUSTRALIA(SOUTH, EAST),
    AFRICA(SOUTH, EAST),
    NORTH_AMERICA(NORTH, WEST),
    SOUTH_AMERICA(SOUTH, WEST),
    EUROPE(NORTH, EAST),
    ASIA(NORTH, EAST),
    ANTARCTICA(SOUTH, null);

    private VerticalDirection verticalDirection;
    private HorizontalDirection horizontalDirection;

    Continent(VerticalDirection verticalDirection, HorizontalDirection horizontalDirection) {
        this.verticalDirection = verticalDirection;
        this.horizontalDirection = horizontalDirection;
    }

    public VerticalDirection getVerticalDirection() {
        return verticalDirection;
    }

    public HorizontalDirection getHorizontalDirection() {
        return horizontalDirection;
    }
}
