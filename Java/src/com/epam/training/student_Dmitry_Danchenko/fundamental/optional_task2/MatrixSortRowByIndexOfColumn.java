package com.epam.training.student_Dmitry_Danchenko.fundamental.optional_task2;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
 * 1.1. Упорядочить строки (row) матрицы в порядке возрастания значений элементов k-го столбца(column).
 */

public class MatrixSortRowByIndexOfColumn {

    public int[][] ints;

    public MatrixSortRowByIndexOfColumn(int matrixSize, int precision) {
        ints = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                ints[i][j] = (int) (Math.random() * (precision * 2 + 1)) - precision;
            }
        }
    }

    public void show() {
        for (int[] numbers : ints) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }

    private static void bubbleSort(int[][] matrix, int column) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][column];
        }
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    for (int l = 0; l < matrix.length; l++) {
                        int temp1 = matrix[j][l];
                        matrix[j][l] = matrix[j + 1][l];
                        matrix[j + 1][l] = temp1;
                    }
                }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter dimension, precision and column to sort a matrix by row!");
        } else {
            int matrixSize = Integer.parseInt(args[0]);
            int precision = Integer.parseInt(args[1]);
            int column = Integer.parseInt(args[2]);
            MatrixSortRowByIndexOfColumn matrix = new MatrixSortRowByIndexOfColumn(matrixSize, precision);
            System.out.println("Matrix row and column is : " + args[0] + ". MathRandom to fill matrix is from -"
                    + args[1] + " to " + args[1] + ".");
            System.out.println("Number of column to sort matrix in ascending is " + (column + 1) + ".");
            System.out.println("Matrix before sorting :");
            matrix.show();
            System.out.println("Sorted matrix in ascending(+) order by column " + (column + 1) + ":");
            bubbleSort(matrix.ints, column);
            matrix.show();

        }
    }
}
