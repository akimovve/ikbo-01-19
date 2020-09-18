package ru.mirea.lab9;

public class ThrowsDemo01 {
    public static void main(String[] args) {
        // Задание 5
        // Метод getDetails() изначально неудобно оборачивать в блок try-catch, поскольку непонятно,
        // какую именно часть кода нужно обернуть в блок, т.к. не производится никаких операций.
        // Для этого небходим отдельный метод, в котором будет осуществляться проверка getDetails().
        // Это и следует поместить в блок try-catch.

        // Пройдёт
        printMessage("some_key");
        // Не пройдёт
        printMessage(null);
    }

    public static String getDetails(String key) {
        if (key == null)
            throw new NullPointerException("null key in getDetails");
        return "data for " + key;
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e){
            System.out.println("Key cannot be null");
        }
    }
}
