package com.epam.training.student_Dmitry_Danchenko.fundamental.optional_task1;

/**
 * 2. Ввести n чисел с консоли. Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class NumbersInAscendingAndDescendingOfTheirLength {
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
            System.out.print("Arguments:");
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                System.out.print(" " + args[i]);
            }
            bubbleSorting(numbers);
            System.out.println("\n" + "Increase :");
            for (int number : numbers) {
                System.out.println("Number " + number + " with length " + String.valueOf(number)
                        .length());
            }
            System.out.println("Decrease :");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println("Number " + numbers[i] + " with length  " + String.valueOf(numbers[i])
                        .length());
            }
        }
    }
}