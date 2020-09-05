package ru.mirea.lab1;

public class Example5 {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.printf("%d) %d;\n", i, calcFactorial(i));
        }
    }

    public static long calcFactorial(int digit){
        long res = 1;
        for (int i = 1; i <= digit; i++){
            res *= i;
        }
        return res;
    }
}
