package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Дано натуральное число N. Вычислите сумму его цифр.
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(calcAmountOfDigit(scanner.nextInt()));
    }

    private static int calcAmountOfDigit(int n) {
        if (n < 0) {
            throw new IllegalStateException("Число не может быть меньше 0.");
        }
        return (n != 0)? calcAmountOfDigit(n / 10) + (n % 10) : n;
    }
}
