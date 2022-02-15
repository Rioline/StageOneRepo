package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseOrderScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arguments and press <ENTER>:");
        String arguments = scan.nextLine();
        scan.close();
        System.out.println("Arguments: " + arguments);
        String[] splitStrings = arguments.split(" ");
        List<String> list = Arrays.asList(splitStrings);
        List<String> reverseList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("After reverse: " + reverseList);
    }
}
