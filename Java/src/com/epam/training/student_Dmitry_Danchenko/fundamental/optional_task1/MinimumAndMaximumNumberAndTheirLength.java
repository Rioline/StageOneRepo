package com.epam.training.student_Dmitry_Danchenko.fundamental.optional_task1;

/**
 * 1. Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class MinimumAndMaximumNumberAndTheirLength {

    public static void bubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter some numbers in command line!");
        } else {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++)
                numbers[i] = Integer.parseInt(args[i]);
            bubbleSorting(numbers);
            for (int i = 0; i < numbers.length; ++i) {
                System.out.println("Shortest number is " + numbers[0] + " with length  " + String.valueOf(numbers[0])
                        .length());
                break;
            }
            for (int i = numbers.length - 1; i >= 0; --i) {
                System.out.println("Largest number is  " + numbers[i] + " with length  " + String.valueOf(numbers[i])
                        .length());
                break;
            }
        }
    }
}
