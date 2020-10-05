package ru.mirea.pr12.task_2;

public class Test {
    public static void main(String[] args) {
        // Без указания разделителя
        System.out.println(new Address("Россия, ЦФО, Москва, Театральная площадь, 1, 1, 1"));
        System.out.println(new Address("Россия, ЦФО, Москва, Малая Бронная, 23, 2, 46"));
        System.out.println(new Address("Россия, ЦФО, Москва, Арбат, 26, 1, 1"));
        System.out.println(new Address("Россия, ЦФО, Москва, Воздвиженка, 3/5, 3, 27"));
        System.out.println();
        // С указанием разделителя
        System.out.println(new Address("Россия, ЦФО, Москва, Театральная площадь, 1, 1, 1", ","));
        System.out.println(new Address("Россия; ЦФО; Москва; Малая Бронная; 23; 2; 46", ";"));
        System.out.println(new Address("Россия. ЦФО. Москва. Арбат. 26. 1. 1", "."));
        System.out.println(new Address("Россия-ЦФО-Москва-Воздвиженка-3/5-3-27", "-"));
    }
}
