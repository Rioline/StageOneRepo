package com.epam.training.student_Dmitry_Danchenko.fundamental.optional_task2;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 * Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
 * 1.2. Упорядочить столбцы(column) матрицы в порядке возрастания значений элементов k-й строки(row).
 */

public class MatrixSortColumnByIndexOfRow {
    public int[][] ints;

    public MatrixSortColumnByIndexOfRow(int matrixSize, int precision) {
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

    private static void bubbleSort(int[][] matrix, int row) {
        int[] arr = new int[matrix.length];
        System.arraycopy(matrix[row], 0, arr, 0, matrix.length);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    for (int l = 0; l < matrix.length; l++) {
                        int temp1 = matrix[l][j];
                        matrix[l][j] = matrix[l][j + 1];
                        matrix[l][j + 1] = temp1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter dimension, precision and row to sort a matrix by column!");
        } else {
            int matrixSize = Integer.parseInt(args[0]);
            int precision = Integer.parseInt(args[1]);
            int row = Integer.parseInt(args[2]);
            MatrixSortRowByIndexOfColumn matrix = new MatrixSortRowByIndexOfColumn(matrixSize, precision);
            System.out.println("Matrix row and column is : " + args[0] + ". MathRandom to fill matrix is from -"
                    + args[1] + " to " + args[1] + ".");
            System.out.println("Number of row to sort matrix in ascending is " + (row + 1) + ".");
            System.out.println("Matrix before sorting :");
            matrix.show();
            System.out.println("Sorted matrix in ascending(+) order by row " + (row + 1) + ".");
            bubbleSort(matrix.ints, row);
            matrix.show();
        }
    }
}

