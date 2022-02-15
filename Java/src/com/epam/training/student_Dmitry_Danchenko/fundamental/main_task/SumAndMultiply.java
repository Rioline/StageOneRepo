package com.epam.training.student_Dmitry_Danchenko.fundamental.main_task;

/**
 * 4. Ввести целые числа как аргументы командной строки.
 * Подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class SumAndMultiply {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter some numbers in command line!");
        } else {
            int sum = 0;
            int mul = 1;
            for (String arg : args) {
                sum = sum + Integer.parseInt(arg);
                mul = mul * Integer.parseInt(arg);
            }
            System.out.println("Sum is : " + sum + "\n" + "Multiply is : " + mul);
        }
    }
}