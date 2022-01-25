package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

/**
 * 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */

public class MonthName {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter number of month in command line!");
        } else {
            try {
                int monthNumber = Integer.parseInt(args[0]);
                switch (monthNumber) {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                    default:
                        System.out.println("Month in year only 12=) Enter a number of month from 1 to 12!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error! You entered: " + args[0] + "\n" +
                        "But need enter a number of month from 1 to 12!");
            }
        }
    }
}
