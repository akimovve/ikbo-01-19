package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo03 {
    public static void main(String[] args) {
        // Задания 7 и 8
        getKey();
    }

    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        try {
            printDetails(scanner.nextLine());
        } catch (Exception e) {
            System.out.print("Error! You entered an empty key.");
        }
    }

    public static void printDetails(String key) throws Exception {
        System.out.print(getDetails(key));
    }

    private static String getDetails(String key) throws Exception {
        if (key.isEmpty())
            throw new Exception();
        return "data for " + key;
    }
}
