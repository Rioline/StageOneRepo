package com.epam.training.student_Dmitry_Danchenko.fundamental.optional_task1;

/**
 * 3. Ввести n чисел с консоли. Вывести на консоль те числа,
 * длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class AverageLengthOfNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter some numbers in command line!");
        } else {
            double sumOfArgsLengths = 0;
            double averageLength = 0;
            System.out.println("Entered arguments is: ");
            for (String arg : args) {
                sumOfArgsLengths = sumOfArgsLengths + String.valueOf(arg)
                        .length();
                averageLength = sumOfArgsLengths / args.length;
                System.out.print(" " + arg);
            }
            System.out.println("\n" + "Sum of " + args.length + " arguments lengths is " + sumOfArgsLengths);
            System.out.println("Average length of arguments is  " + sumOfArgsLengths + " / " + args.length + " = "
                    + averageLength + ".");
            System.out.println("Arguments with length less then average length :");
            for (String arg : args) {
                if (arg.length() < averageLength) {
                    System.out.println("Number " + arg + " with length " + arg.length() + ".");
                }
            }
            System.out.println("Arguments with length more then average length :");
            for (String arg : args) {
                if (arg.length() > averageLength) {
                    System.out.println("Number " + arg + " with length " + arg.length() + ".");
                }
            }
        }
    }
}
