package ru.mirea.pr6.task_2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[scanner.nextInt()];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, (int) (1 + Math.random() * 5));
        }
        System.out.println("Исходный массив:");
        Arrays.stream(students).forEach(System.out::println);

        // Первый способ с помощью Comparable
        System.out.println("\nОтсортированный методом быстрой сортировки массив:");
        quickSort(students, 0, students.length - 1);
        Arrays.stream(students).forEach(System.out::println);

        // Второй способ с помощью Comparator
        ArrayList<Student> studentList =
                Arrays.stream(students)
                        .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(studentList);
        System.out.println("\nПеремешанный массив:");
        studentList.forEach(System.out::println);
        System.out.println("\nОтсортированный массив:");
        studentList.stream()
                .sorted(new SortingStudentsByGpa())
                .forEach(System.out::println);
    }

    private static void quickSort(Student[] array, int first, int last) {
        if (first < last) {
            int partitionIndex = partition(array, first, last);
            quickSort(array, first, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, last);
        }
    }

    private static int partition(Student[] array, int first, int last) {
        Student pivot = array[last];
        int i = first - 1;

        for (int j = first; j < last; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                Student swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        Student swapTemp = array[i + 1];
        array[i + 1] = array[last];
        array[last] = swapTemp;
        return i + 1;
    }
}
