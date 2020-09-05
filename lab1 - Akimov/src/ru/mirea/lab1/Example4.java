package ru.mirea.lab1;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int[] testArray = new int[10];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 101);
        }
        System.out.print("Test array: " + Arrays.toString(
                Arrays.stream(testArray)
                        .toArray()));
        System.out.println("\nSorted array: " +
                Arrays.toString(
                        Arrays.stream(testArray)
                                .sorted()
                                .toArray()));
    }
}
