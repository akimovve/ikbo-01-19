package ru.mirea.pr6.task_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[scanner.nextInt()];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    (long) (Math.random() * 100),
                    i + " student");
        }
        System.out.println("Исходный массив:");
        Arrays.stream(students).forEach(System.out::println);

        System.out.println("\nОтсортированный вставками массив:");
        insertionSort(students);
        Arrays.stream(students).forEach(System.out::println);
    }

    private static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student keyStudent = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].getId() > keyStudent.getId()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = keyStudent;
        }
    }
}
