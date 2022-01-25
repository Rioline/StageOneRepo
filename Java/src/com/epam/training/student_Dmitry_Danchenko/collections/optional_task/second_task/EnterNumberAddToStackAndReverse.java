package com.epam.training.student_Dmitry_Danchenko.collections.optional_task.second_task;

/**
 * 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
 */

import java.util.Stack;

public class EnterNumberAddToStackAndReverse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter a number from command line!");
        } else {
            String inputtedFromCommandLine = args[0];
            System.out.println("Entered number: " + inputtedFromCommandLine);
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < inputtedFromCommandLine.length(); i++) {
                stack.push(inputtedFromCommandLine.charAt(i));
            }
            System.out.println("Stack: " + stack);

            StringBuilder stringBuilder = new StringBuilder();
            while (!stack.empty()) {
                stringBuilder.append(stack.pop());
            }
            System.out.println("Reverse: " + "" + stringBuilder);
        }
    }
}
