package ru.mirea.lab9;

import java.util.Scanner;

public class ExceptionTests {
    public static void main(String[] args) {
        // Задание 1
        Exception1.exceptionDemo();

        // Задание 2
        Exception2.exceptionDemo();

        // Задание 3
        // В случае добавления Exception в начало списка в блок catch, всё время будет отрабатывать
        // только этот блок. Дальнейшие отлавливатели ошибок рассматриваться не будут.
        // Это происходит из-за того, что класс Exception - родитель всех остальных видов исключений.

        // Задание 4
        // Блок finally - блок, который будет выполняться вне зависимости от того, было ли отловлено
        // исключение или нет.
    }

    static class Exception1 {
        public static void exceptionDemo() {
            try {
                System.out.println(2 / 0); // (2.0 / 0.0) = Infinity
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    static class Exception2 {
        public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print("Enter an integer ");
            try {
                int i = Integer.parseInt(myScanner.next());
                System.out.println(2 / i);
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Error in getting data: " + e.getMessage());
            } finally {
                System.out.print("Finished.");
            }
        }
    }
}
