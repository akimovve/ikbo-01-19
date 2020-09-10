package ru.mirea.pr7;

import ru.mirea.pr7.lists.DequePlay;
import ru.mirea.pr7.lists.DoubleListPlay;
import ru.mirea.pr7.lists.QueuePlay;
import ru.mirea.pr7.lists.StackPlay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stack collection");
        new StackPlay(false).play();

        System.out.println("\nQueue collection");
        new QueuePlay(false).play();

        System.out.println("\nDeque collection");
        new DequePlay(false).play();

        System.out.println("\nDoubleList");
        new DoubleListPlay(false).play();
    }
}

class Main2 {
    public static void main(String[] args) {
        new Interactive();
    }
}
