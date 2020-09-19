package ru.mirea.lab10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task4 {
    final private static String CATALOG_PATH = "src/ru/mirea/lab10";

    public static void main(String[] args) {
        catalogContent(new File(CATALOG_PATH))
                .forEach(System.out::println);
    }

    private static List<String> catalogContent(File dir) {
        List<String> resp = new ArrayList<>();
        if (dir.isDirectory()) {
            for (File file : Objects.requireNonNull(dir.listFiles())) {
                resp.add(file.getName());
            }
        }
        return resp;
    }
}
