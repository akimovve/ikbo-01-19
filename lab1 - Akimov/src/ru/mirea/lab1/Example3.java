package ru.mirea.lab1;

public class Example3 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.printf(", 1/%d", i);
            }
        }
    }
}
