package com.epam.training.student_Dmitry_Danchenko.collections.optional_task.first_task;

/**
 * 1.Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileCreating {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("TextForTask.txt", false)) {
            String text1 = " First string 1\n";
            String text2 = " Second string 2\n";
            String text3 = " Third string 3\n";
            String text4 = " Fourth string 4\n";

            writer.write(text1);
            writer.write(text2);
            writer.write(text3);
            writer.write(text4);

            writer.flush();

            System.out.println("We added\n" + text1 + text2 + text3 + text4 + "to file TextForTask.txt");

        } catch (IOException ex) {
            System.out.println("Something get wrong!");
        }
    }
}
