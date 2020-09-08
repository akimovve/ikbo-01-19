package ru.mirea.pr5;

/**
 * Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, ...
 * По данному натуральному n выведите первые n членов этой последовательности.
 * Попробуйте обойтись только одним циклом for.
 */
public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 76; i++) {
            System.out.print(i + ") ");
            System.out.println(triangleSequence(i));
        }
    }

    private static String triangleSequence(int n) {
        if (n < 1) {
            throw new IllegalStateException("Число не может быть меньше 1.");
        }
        if (n == 1) {
            return String.valueOf(n);
        }
        int nextDigit = 0;
        int numOfPrintedDigits = 0;
        for (int i = 1; numOfPrintedDigits < n; i++) {
            nextDigit = i;
            numOfPrintedDigits += i;
        }
        System.out.format("%s %d", triangleSequence(--n), nextDigit);
        return "";
    }
}
