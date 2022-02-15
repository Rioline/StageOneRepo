package com.epam.training.student_Dmitry_Danchenko.collections.optional_task.third_task;

/**
 * 3. Создать список из элементов каталога и его подкаталогов.
 */

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CreateListFromListOfCatalogs {
    public static void main(String[] args) {
        File f = new File("C:/Program Files");
        List<String> namesOfCatalogs = Arrays.asList(Objects.requireNonNull(f.list()));
        System.out.println("Length of list is: " + namesOfCatalogs.size());
        System.out.println("Names of catalogs are: " + namesOfCatalogs);
    }
}

