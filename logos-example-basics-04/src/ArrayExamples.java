public class ArrayExamples {

    public static void main(String[] args) {

        double[] dArray;
        boolean[] bbb;
        String[] strings;

        int[] numbers = new int[15];
        numbers[0] = 100;
        numbers[1] = 101;
        numbers[2] = 102;
        numbers[3] = 105;
        numbers[4] = 105;
        numbers[5] = 104;
        numbers[6] = 105;
        numbers[7] = 105;
        numbers[8] = 105;
        numbers[9] = 109;


        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.println(numbers[counter]);
        }

       // int[]  testArray = new int[10];
      //  for (int counter = 0; counter < testArray.length; counter++) {
           // testArray[counter] = counter;
        }
    }
