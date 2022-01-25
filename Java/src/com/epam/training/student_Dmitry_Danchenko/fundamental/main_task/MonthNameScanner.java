package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

import java.util.Scanner;

public class MonthNameScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of month from 1 to 12 and press <ENTER>: ");
        while (!scan.hasNextInt()) {
            String str;
            str = scan.next();
            System.out.println("Error! You entered: " + str + "\n" + "But need enter a number of month from 1 to 12!");
            System.out.println("Enter number of month from 1 to 12 and press <ENTER>: ");
        }
        int monthNumber = scan.nextInt();
        scan.close();
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
    }
}


