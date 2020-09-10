/*
Copyright  Logos it academy. all rights reserved.
LOGOS IY ACADEMY PROPRIETARY/CONFIDENTIAL.
 */
package homeWorks.hw8.number1.lesson08.jc08hw;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        boolean go = true;
        Month[] month = Month.values();
        Seasons[] season = Seasons.values();
        final String enterMonth = "Введіть місяць";
        final String error = "Такого(их) місяця(ів) не існує";
        info();//метод, який містить в собі всю інформацію про, можливі дії в програмі
        while (go) { //цикл для того щоб програма використовувалась завжди, поки її самі не закінчать
            System.out.println("Введіть опцію, що ви хочете зробити");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            if (choose.matches("^[0-9]*$")) { //перевірка

            } else throw new WrongInputConsoleParamatersException();
            //якщо не підходить введений тип даних, викидує помилку


            switch (choose) {//switch/case для всього функціоналу
                case "1":
                    System.out.println(enterMonth);
                    String name = sc.nextLine().toUpperCase();
                    int j = 0;
                    for (Month c : month) {
                        if (name.equals(c)) {
                            System.out.println(name + " Існує");
                            j++;
                        }
                    }
                    if (j == 0) {
                        System.out.println(error);
                    }
                    break;

                case "2":
                    System.out.println(enterMonth);
                    String season1 = sc.nextLine().toUpperCase();
                    int count = 0;
                    for (Month c : month) {
                        if (season1.equals(c.name())) {
                            Seasons seasons2 = c.getSeasons();
                            for (Month k : month) {
                                if (seasons2.equals(k.getSeasons())) {
                                    System.out.println(k.name());
                                }
                            }
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println(error);
                    }
                    break;

                case "3":
                    System.out.println(enterMonth);
                    String monthDays = sc.nextLine().toUpperCase();
                    int count1 = 0;
                    for (Month c : month) {
                        if (monthDays.equals(c.name())) {
                            int monthDays1 = c.getDays();
                            for (Month k : month) {
                                if (monthDays1 == k.days) {
                                    System.out.println(k.name());
                                    count1++;
                                }
                            }
                        }

                    }
                    if (count1 == 0) {
                        System.out.println(error);
                    }


                    break;
                case "4":
                    System.out.println(enterMonth);
                    String monthDaysLess = sc.nextLine().toUpperCase();
                    int count2 = 0;
                    for (Month c : month) {
                        if (monthDaysLess.equals(c.name())) {
                            int monthDaysLess1 = c.getDays();
                            for (Month k : month) {
                                if (monthDaysLess1 > k.days) {
                                    System.out.println(k.name());
                                    count2++;
                                }
                            }
                        }

                    }
                    if (count2 == 0) {
                        System.out.println(error);
                    }
                    break;
                case "5":
                    System.out.println(enterMonth);
                    String monthDaysMore = sc.nextLine().toUpperCase();
                    int count3 = 0;
                    for (Month c : month) {
                        if (monthDaysMore.equals(c.name())) {
                            int monthDaysMore1 = c.getDays();
                            for (Month k : month) {
                                if (monthDaysMore1 < k.days) {
                                    System.out.println(k.name());
                                    count3++;
                                }
                            }
                        }

                    }
                    if (count3 == 0) {
                        System.out.println(error);
                    }
                    break;
                case "6":
                    System.out.println("Введіть пору року");
                    Seasons[] seasons = Seasons.values();
                    int count4 = 0;
                    int index = Seasons.valueOf(sc.nextLine().toUpperCase())
                            .ordinal() + 1;
                    if (index > seasons.length - 1) {
                        index = 0;
                        count4++;
                    }
                    System.out.println(seasons[index]);
                    if (count4 == 0)
                        System.out.println("Такої пори року не існує");


                    break;


                case "7":
                    System.out.println("Введіть пору року");
                    Seasons[] seasons1 = Seasons.values();
                    int index1 = Seasons.valueOf(sc.nextLine().toUpperCase())
                            .ordinal() - 1;
                    int count5 = 0;
                    if (index1 == -1) index1 = seasons1.length - 1;
                    System.out.println(seasons1[index1]);
                    count5++;
                    if (count5 == 0) ;
                    System.out.println("Такої пори року не існує");
                    break;
                case "8":
                    for (Month c : month) {
                        if (c.getDays() % 2 == 0) {
                            System.out.println(c);
                        }
                    }

                    break;
                case "9":
                    for (Month c : month) {
                        if (c.getDays() % 2 == 1) {
                            System.out.println(c);
                        }
                    }
                    break;
                case "10":
                    System.out.println(enterMonth);
                    String monthPair = sc.nextLine().toUpperCase();
                    Month month2 = Month.valueOf(monthPair);
                    int count6 = 0;
                    for (Month c : month) {
                        if (month2.equals(c)) {
                            if (c.getDays() % 2 == 0) {
                                System.out.println(c + " Має парну кількість днів");
                                count6++;
                            } else {
                                System.out.println(c + " Не має парну кількість днів");
                                count6++;
                            }

                        }

                    }
                    if (count6 == 0) ;
                    System.out.println(error);
                    break;
                case "11":
                    info();//викликає інформацію
                    break;
                case "12":
                    go = false;//закінчую цикл
                    break;

            }


        }


    }


    public static void info() {
        System.out.println("1 - Перевірка чи є такий місяць");
        System.out.println("2 - Вивести всі місяці з такою ж порою року");
        System.out.println("3 - Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("4 - Вивести всі місяці які мають меншу кількість днів");
        System.out.println("5 - Вивести всі місяці які мають більшу кількість днів");
        System.out.println("6 - Вивести наступну пору року");
        System.out.println("7 - Вивести попередню пору року");
        System.out.println("8 - Вивести всі місяці які мають парну кількість днів");
        System.out.println("9 - Вивести всі місяці які мають непарну кількість днів");
        System.out.println("10 -Чи має місяць парну кількість днів");
        System.out.println("11 - Меню");
        System.out.println("12 - Завершення роботи");
    }

}
