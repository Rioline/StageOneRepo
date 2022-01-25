package com.epam.training.student_Dmitry_Danchenko.fundamental.optional_task2;

/**
 * Задание. Ввести с консоли n - размерность матрицы a [n][n].
 * Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
 * 4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */

import java.util.ArrayList;
import java.util.Random;

public class MatrixMaxElement {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter dimension and precision of a matrix!");
        } else {
            int matrixSize = Integer.parseInt(args[0]);
            int precision = Integer.parseInt(args[1]);
            int max = -Integer.parseInt(args[1]);
            int[][] arr = new int[matrixSize][matrixSize];
            Random random = new Random();
            ArrayList<Integer> rows = new ArrayList<>();
            ArrayList<Integer> column = new ArrayList<>();
            System.out.println("Matrix before sorting : " + args[0] + "x" + args[0] +
                    ". MathRandom to fill matrix is from -" + args[1] + " to " + args[1] + ".");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.ints(matrixSize, -precision, precision)
                        .toArray();
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Max element in matrix: " + max + ".");

            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    if (max == arr[i][j]) {
                        if (!rows.contains(j))
                            rows.add(j);
                        if (!column.contains(i))
                            column.add(i);
                    }
                }
            }
            int[][] newArr = new int[matrixSize - rows.size()][matrixSize - column.size()];
            int newArrI = 0;
            int newArrJ = 0;
            System.out.println("Matrix after sorting : " + (matrixSize - rows.size()) + "x"
                    + (matrixSize - column.size()) + ".");
            for (int i = 0; i < matrixSize; i++) {
                if (!rows.contains(i)) {
                    newArrJ = 0;
                    for (int j = 0; j < matrixSize; j++) {
                        if (!column.contains(j)) {
                            newArr[newArrI][newArrJ]
                                    = arr[j][i];
                            newArrJ++;
                        }
                    }
                    newArrI++;
                }
            }

            for (int i = 0; i < newArr.length; i++) {
                for (int j = 0; j < newArr[i].length; j++) {
                    System.out.print(newArr[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}