package ru.mirea.lab7.task_3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        OwnArrayList<Integer> list01 = new OwnArrayList<>();
        for (int i = 0; i < 24; i++) {
            list01.add(i);
        }
        System.out.println("list01: " + list01);

        OwnArrayList<Integer> list02 = new OwnArrayList<>(15);
        for (int i = 0; i < 14; i++) {
            list02.add(i + 1);
        }
        System.out.println("list02: " + list02);

        Integer[] ar = new Integer[11];
        for (int i = 0; i < 11; i++) {
            ar[i] = i;
        }
        OwnArrayList<Integer> list03 = new OwnArrayList<>(Arrays.asList(ar));
        System.out.println(list03.size());
        System.out.println(list03);
        System.out.println(list03.get(4));
        list03.add(4, 2);
        System.out.println("list03: " + list03);
        System.out.println(list03.size());

        list03.addAll(list01);
        System.out.println(list03);

        OwnArrayList<Integer> list04 = OwnArrayList.of(ar);
        System.out.println("list04: " + list04);
        list04.remove(3);
        System.out.println("list04 (remove): " + list04);
    }
}
