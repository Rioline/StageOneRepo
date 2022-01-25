package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

import java.util.Scanner;

public class HelloUserScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name and press <ENTER>:");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");
        scan.close();
    }
}
