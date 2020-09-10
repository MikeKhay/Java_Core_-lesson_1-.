package homeWorks.hw8.number1.lesson08.continets;

import java.util.Scanner;

public class WorldMapApp {

    public static void main(String[] args) {
        boolean proceed = true;
        while (proceed) {

            System.out.println("Hi, traveller!");
            System.out.println("Choose your option");
            System.out.println("Enter 1 - Which vertical direction would you like to investigate?");
            System.out.println("Enter 2 - Which horizontal direction would you like to investigate?");
            System.out.println("Enter 3 - What next?");

            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Enter desired vertical direction");
                    String vd = sc.nextLine();
                    VerticalDirection desiredVD = VerticalDirection.valueOf(vd);
                    Continent[] continents = Continent.values();
                    int count = 0;
                    for (Continent c : continents) {
                        if (desiredVD.equals(c.getVerticalDirection())) {
                            count++;
                            System.out.println(c.name());
                        }
                    }
                    if (count == 0) {
                        System.out.println("Sorry, nowhere to go");
                    }
                    proceed = false;
                    break;
                case "2":
                    // ask for desired horizontal direction - and return all continents on that side
                    proceed = false;
                    break;
                case "3":
                    // ask for previously visited continent and return another continent that have next ordinal value
                    // if provided continent has last ordinal in enum - return first item in enum
                    proceed = false;
                    break;
                default:
                    System.out.printf("It is not an option. Let's try again \n");
            }
        }
    }
}
