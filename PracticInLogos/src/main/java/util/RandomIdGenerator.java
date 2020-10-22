package util;

public class RandomIdGenerator {

    private static final int MIN = 1;
    private static final int MAX = 2147483646;

    public static int getRandomID() {
        return (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
    }
}
