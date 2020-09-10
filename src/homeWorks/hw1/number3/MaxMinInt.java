package homeWorks.hw1.number3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MaxMinInt {
    public static void main(String[] args) {
        int array[] = {5, 7, 3, 8, 3, 8, 1, 34, 6, 39};

        int max = 5;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

            int min = 5;
            for (int a = 0; a < array.length; a++) {
                if (min > array[a]) {
                    min = array[a];
                }
            }
        System.out.println("MaxArray: " + max);
        System.out.println("MinArray: " + min);

    }
}
