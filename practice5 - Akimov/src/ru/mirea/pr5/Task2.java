package ru.mirea.pr5;

/**
 * Дано натуральное число n. Выведите все числа от 1 до n.
 */
public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            next(i);
            System.out.println();
        }
    }

    private static void next(int n) {
        if (n < 1) {
            throw new IllegalStateException("Число не может быть меньше 1.");
        }
        if (n > 1) {
            next(n - 1);
        }
        System.out.print(n + " ");
    }
}
