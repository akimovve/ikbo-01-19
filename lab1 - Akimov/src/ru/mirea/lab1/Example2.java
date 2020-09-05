package ru.mirea.lab1;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        // Example2.class для запуска через терминал с передачей параметров в args
        for (String str : args) {
            System.out.println(str);
        }
        // Arrays.stream(args).forEach(System.out::println);
    }
}
