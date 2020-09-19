package ru.mirea.pr10.task_1;

public class Test {
    public static void main(String[] args) {
        Complex complex = new ConcreteFactory().createComplex(2, 3);
        System.out.print(complex);
    }
}
