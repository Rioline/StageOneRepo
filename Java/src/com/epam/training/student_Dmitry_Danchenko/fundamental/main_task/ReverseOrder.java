package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class ReverseOrder {
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Enter some arguments in command line to reverse!");
        } else {
            System.out.print("Arguments: ");
            for (String arg : args) {
                System.out.print(arg + " ");
            }
            System.out.println();
            System.out.print("After reverse: ");
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.print(args[i] + " ");
            }
        }
    }
}
