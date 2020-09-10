package homeWorks.hw8.number1.lesson08.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ReaderApp {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter any number: ");
        double d = runReader();
        analyzeNumber(d);
    }

    public static double runScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double runReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double d = Double.parseDouble(s);
        return d;
    }

    public static void analyzeNumber(double d) {
        if (d % 1 == 0) {
            System.out.println("It is integer");
            if (d % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Has decimal part");
        }
    }

}
