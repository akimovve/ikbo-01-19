package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Даны натуральные числа k и d.
 * Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d.
 * Запись натурального числа не может начинаться с цифры 0.
 * В этой задаче можно использовать цикл для перебора всех цифр, стоящих на какой-либо позиции.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(givenSum(scanner.nextInt(), scanner.nextInt(), 0, 0));
    }

    private static int givenSum(int k, int d, int amount, int len) {
        int counter = 0;
        if (d == amount && k == len) {
            return 1;
        } else if (k <= len) {
            return 0;
        } else {
            for (int i = (len == 0) ? 1 : 0; i < 10; i++) {
                counter += givenSum(k, d, amount + i, len + 1);
            }
        }
        return counter;
    }
}
