package ru.mirea.lab7.task_1_and_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * add(i): ArrayList (не на много быстрее)
 * add(0, i): LinkedList (так как вставка в начало)
 * get(i): ArrayList
 * remove(i): LinkedList
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list = new LinkedList<>(list);
        list = list.stream().filter(x -> x > 6).collect(Collectors.toList());
        System.out.println(list);

        countTime(new ArrayList<>());
        countTime(new LinkedList<>());
    }

    private static void countTime(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        Long start = System.currentTimeMillis();

        list.remove(0);
        list.remove(10);
        list.remove(100);
        list.remove(1000);
        list.remove(10000);
        list.remove(100000);

        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
