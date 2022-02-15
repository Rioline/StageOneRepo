package com.epam.training.student_Dmitry_Danchenko.collections.optional_task.first_task;

/**
 * 1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadAndSortReverse {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("TextForTask.txt"), StandardCharsets.UTF_8);
        System.out.println("Data from file TextForTask.txt");
        for (String line : lines) {
            System.out.println(line);
        }
        Collections.reverse(lines);

        Path file = Paths.get("TextForTask.txt");
        Files.write(file, lines, StandardCharsets.UTF_8);
        System.out.println("Reversed and added to file TextForTask.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
