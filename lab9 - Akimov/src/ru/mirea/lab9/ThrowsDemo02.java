package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo02 {
    public static void main(String[] args) {
        // Задание 6
        printDetails("some_key");
        printDetails("");
    }

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            // throw e;
            System.out.println("The string is empty");
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals(""))
            throw new Exception("Key set to empty string");
        return "data for " + key;
    }
}
