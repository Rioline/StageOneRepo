package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class HelloUser {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter name in command line!");
        } else {
            for (String arg : args)
                System.out.print("Hello " + arg + "!");
        }
    }
}
