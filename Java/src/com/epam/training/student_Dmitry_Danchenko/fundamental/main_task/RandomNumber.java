package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

/**
 * 3. Вывести заданное количество случайных чисел.
 */

public class RandomNumber {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Enter first number (quantity)  and second number (precision) in command line!");
        } else {
            int[] array = new int[Integer.parseInt(args[0])];
            int precision = Integer.parseInt(args[1]);
            System.out.println("Quantity of arguments is: " + args[0]);
            System.out.println("Precision to math random this numbers is from: " + args[1]+ " to -" + args[1]);
            System.out.println("Preset quantity  of random numbers: ");
            for (int i = 0; i < array.length; i++) {
                int numbers = (int) (Math.random() * (precision * 2 + 1)) - precision;
                System.out.print(" " + numbers);
            }
        }
    }
}