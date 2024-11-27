package ISTAD_Lesson.FlowControl;

import java.util.Scanner;



public class CalculateWage {
    static final int rate = 4100;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;
        enum DAY {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
            SATURDAY, SUNDAY
        }
        do {
            System.out.println("1. Wage Calculator");
            System.out.println("2. Money Exchange ");
            System.out.println("5. Exit ");

            System.out.println("Choose (1 - 5) : ");
            option = input.nextInt();
            switch (option) {
                case 1: {
                    float hour;
                    float wage;
                    String day;
                    float result;
                    DAY enumDay;
                    // wages -> 10
                    // hours -> 2 , 3, 4,
                    // SAT, SUN -> result * 2
                    System.out.println("--------------<<<Wage Calculator>>>-------------");
                    System.out.println("Enter hour(hrs): ");
                    hour = input.nextFloat();
                    System.out.println("Enter wage($): ");
                    wage = input.nextFloat();
                    System.out.println("Enter day (ex. MONDAY,...,SUNDAY): ");
                    day = input.next().toUpperCase();
                    result = wage * hour;
                    // convert normal string to enum
                    enumDay = DAY.valueOf(day);
                    float finalResult = switch (enumDay) {
                        case DAY.SATURDAY, DAY.SUNDAY -> result * 2;
                        default -> result;
                    };

                    System.out.println("=======================");
                    System.out.println("Hour is : " + hour + (hour >= 2 ? ("hrs") : ("hr")));
                    System.out.println("Wage is : " + wage + "$/1hrs");
                    System.out.println("Day of work : " + day);
//                    System.out.println("Result is : " + (switch (enumDay) {S
//                        case DAY.SATURDAY, DAY.SUNDAY -> result * 2;
//                        default -> result;
//                    }) + "$");
                    System.out.println("Result is : " + finalResult);
                    System.out.println("=======================");

                }
                case 2: {
                    int option1;
                    float dollar;
                    float riel;
                    System.out.println("--------------<<<Money Exchange>>>-------------");
                    System.out.println("1. Exchange Dollar to Riel");
                    System.out.println("2. Exchange Riel to Dollar");
                    System.out.print("Choose (1 - 2): ");
                    option1 = input.nextInt();

                    switch (option1) {
                        case 1 -> {
                            System.out.print("Enter dollar amount: ");
                            dollar = input.nextFloat();
                            System.out.println("Exchange to Riel: " + dollar * rate);
                        }
                        case 2 -> {
                            System.out.print("Enter riel amount: ");
                            riel = input.nextFloat();
                            System.out.println("Exchange to Dollar: " + riel / rate);

                        }
                        default -> System.out.println("Invalid option! Please choose 1 or 2.");
                    }
                    break;
                }

            }
        } while (option != 5);

    }


}
