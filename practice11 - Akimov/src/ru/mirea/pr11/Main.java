package ru.mirea.pr11;

import ru.mirea.pr11.queues.ArrayOwnQueue;
import ru.mirea.pr11.queues.LinkedOwnQueue;
import ru.mirea.pr11.queues.OwnQueue;

public class Main {

    public static void main(String[] args) {
        // Задание 2
        test(new ArrayOwnQueue<>());
        test(new LinkedOwnQueue<>());
    }

    private static void test(OwnQueue<Integer> queue) {
        queue.offer(123);
        queue.offer(456);
        queue.offer(789);
        System.out.println("element: " + queue.element());
        System.out.println(queue);
        System.out.println("peek: " + queue.peek());
        System.out.println(queue);
        System.out.println("poll: " + queue.poll());
        System.out.println(queue);
        System.out.println();
    }
}
