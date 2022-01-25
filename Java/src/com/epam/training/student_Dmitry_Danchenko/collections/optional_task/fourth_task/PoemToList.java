package com.epam.training.student_Dmitry_Danchenko.collections.optional_task.fourth_task;

/**
 * 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PoemToList {
    public static void main(String[] args) {
        String poem = "Ich weiss nicht was soll es bedeutet, das ich so traurig bin. " +
                "Ein Marchen aus alten Zeiten, dass kommt mir nicht aus der Sinn!";
        String onlyWords = poem.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "");
        String[] splitStrings = onlyWords.split(" ");
        List<String> list = Arrays.asList(splitStrings);
        List<String> sorted = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(sorted.get(i) + ":" + sorted.get(i).length() + " ");
        }
    }
}