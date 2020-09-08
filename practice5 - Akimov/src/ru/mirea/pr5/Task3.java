package ru.mirea.pr5;

import java.util.Scanner;

/**
 * Даны два целых числа A и В (каждое в отдельной строке).
 * Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
 * или в порядке убывания в противном случае.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fromAtoB(scanner.nextInt(), scanner.nextInt());
    }

    private static void fromAtoB(int a, int b) {
        if (a > b) {
            System.out.print(a + " ");
            fromAtoB(a - 1, b);
        } else if (a < b) {
            fromAtoB(a, b - 1);
            System.out.print(b + " ");
        } else {
            System.out.print(b + " ");
        }
    }
}
