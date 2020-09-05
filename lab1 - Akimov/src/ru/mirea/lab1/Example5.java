package ru.mirea.lab1;

public class Example5 {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            System.out.printf("%d) %d;\n", i, calcFactorial(i));
        }
    }

    public static int calcFactorial(int digit){
        int res = 1;
        for (int i = 1; i <= digit; i++){
            res *= i;
        }
        return res;
    }
}
