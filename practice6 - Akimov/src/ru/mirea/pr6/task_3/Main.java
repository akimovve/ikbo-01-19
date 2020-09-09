package ru.mirea.pr6.task_3;

import ru.mirea.pr6.task_1.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students1 = new Student[scanner.nextInt()];
        Student[] students2 = new Student[scanner.nextInt()];

        fillArray(students1, 1);
        fillArray(students2, 2);

        System.out.println("Исходный массив 1:");
        Arrays.stream(students1).forEach(System.out::println);
        System.out.println("\nИсходный массив 2:");
        Arrays.stream(students2).forEach(System.out::println);

        mergeSort(students1, 0, students1.length - 1);
        mergeSort(students2, 0, students2.length - 1);

        System.out.println("\nОтсортированный массив 1:");
        Arrays.stream(students1).forEach(System.out::println);
        System.out.println("\nОтсортированный массив 2:");
        Arrays.stream(students2).forEach(System.out::println);

        System.out.println("\nФинальный отсортированный массив:");
        Arrays.stream(mergeSortedArrays(students1, students2)).forEach(System.out::println);
    }

    private static Student[] mergeSortedArrays(Student[] sorted1, Student[] sorted2) {
        int i = 0, j = 0;
        Student[] resArray = new Student[sorted1.length + sorted2.length];
        Student student;
        for (int k = 0; k < resArray.length; k++) {
            if (i > sorted1.length - 1) {
                student = sorted2[j];
                resArray[k] = student;
                j++;
            }
            else if (j > sorted2.length - 1) {
                student = sorted1[i];
                resArray[k] = student;
                i++;
            }
            else if (sorted1[i].getId() < sorted2[j].getId()) {
                student = sorted1[i];
                resArray[k] = student;
                i++;
            } else {
                student = sorted2[j];
                resArray[k] = student;
                j++;
            }
        }
        return resArray;
    }

    private static void mergeSort(Student[] students, int first, int last) {
        if (last <= first)
            return;
        int mid = first + (last - first) / 2;
        mergeSort(students, first, mid);
        mergeSort(students, mid + 1, last);

        Student[] buffer = Arrays.copyOf(students, students.length);
        if (last - first + 1 >= 0) {
            System.arraycopy(students, first, buffer, first, last - first + 1);
        }
        int i = first, j = mid + 1;
        for (int c = first; c <= last; c++) {
            if (i > mid) {
                students[c] = buffer[j];
                j++;
            } else if (j > last) {
                students[c] = buffer[i];
                i++;
            } else if (buffer[j].getId() < buffer[i].getId()) {
                students[c] = buffer[j];
                j++;
            } else {
                students[c] = buffer[i];
                i++;
            }
        }
    }

    private static void fillArray(Student[] students, int num) {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(1 + (long) (Math.random() * 100), num + "" + i + " student");
        }
    }
}
