package homeWorks.hw8.number1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true){
            System.out.println("Виберіть опцію.");
            System.out.println("1.Перевірити чи є такий місяць.");
            System.out.println("2.Вивести всі місяці з такою ж порою року.");
            System.out.println("3.Вивести всі місяці які мають таку саму кількість днів.");
            System.out.println("4.Вивести на екран всі місяці які мають меншу кількість днів.");
            System.out.println("5.Вивести на екран всі місяці які мають більшу кількість днів.");
            System.out.println("6.Вивести на екран наступну пору року.");
            System.out.println("7.Вивести на екран попередню пору року.");
            System.out.println("8.Вивести на екран всі місяці які мають парну кількість днів.");
            System.out.println("9.Вивести на екран всі місяці які мають непарну кількість днів.");
            System.out.println("10.Вивести на екран чи введений з консолі місяць має парну кількість днів.");
            System.out.println("11.Завершити роботу програми.");

            Month[] months = Month.values();
            Season[] seasons =Season.values();
            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Введіть місяць.");
                    String name1 = scanner.nextLine().toUpperCase();
                    try {
                        Month.valueOf(name1);
                        System.out.println("Так є такий місяць: " + name1);
                    }
                    catch (Exception e){
                        System.out.println("Немає такого місяця!!!");
                    }
                break;

                case 2:
                    System.out.println("Введіть місяць.");
                    String name2 = scanner.nextLine().toUpperCase();
                    try {
                        Month m = Month.valueOf(name2);
                        Season s = m.getSeason();

                    }catch (Exception e){
                        System.out.println("Немає такого місяця!!!");
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    for (Month m : months) {
                        if (m.getDay() % 2 == 0){
                            System.out.println(m);
                        };
                    }
                    break;

                case 9:
                    for (Month m : months) {
                        if (m.getDay() % 2 != 0){
                            System.out.println(m);
                        }
                    }
                    break;

                case 10:
                    System.out.println("Введіть назву місяця: ");
                    Scanner scanner10 = new Scanner(System.in);
                    String name10 = scanner10.nextLine().toUpperCase();
                    try {
                        Month month = Month.valueOf(name10);
                        if (month.getDay() % 2 == 0) {
                            System.out.println("Даний місяць: "+name10+" має парну кількість днів: " + month.getDay());
                            }
                        else {
                            System.out.println("Даний місяць: "+name10+" має не парну кількість днів: " + month.getDay());
                        }
                        }
                    catch (Exception e){
                        System.out.println("Немає такого місяця!!!");
                    }
                    break;

                case 11:
                    System.exit(0);
                    System.out.println("Роботу програми завершено!!!");
                    break;
            }
        }
    }
}
