package ru.mirea.lab1;

public class Example1 {
    public static void main(String[] args) {
        int[] testArray = {2, 74, 44, 13, 5, 77, 19, 4};
        // for loop
        int sum = 0;
        for (int el : testArray) {
            sum += el;
        }
        System.out.println("Using loop 'for': " + sum);

        // while loop
        sum = 0;
        int counter = 0;
        while (counter < testArray.length) {
            sum += testArray[counter++];
        }
        System.out.println("Using loop 'while': " + sum);

        // do-while loop
        sum = 0;
        counter = 0;
        do {
            sum += testArray[counter++];
        } while (counter < testArray.length);
        System.out.println("Using loop 'do-while': " + sum);
    }
}
