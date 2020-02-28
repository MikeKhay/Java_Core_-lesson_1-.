public class MaxMin5 {

    public static void main(String[] args) {

        int max = 64;
        int[] number = {64, 253, 93, 40, 25, 15, 450, 97, 9, 53};
        for (int counter = 0; counter < number.length; counter++) {
            if (max < number[counter]) {
                max = number[counter];
            }
        }

                int min = 64;
                for (int counter = 0; counter < number.length; counter++) {
                    if (min > number[counter]) {
                        min = number[counter];
                    }
                }
                System.out.println("Max number " + max);
                System.out.println("Min number " + min);
            }
        }

