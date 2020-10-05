package ru.mirea.pr12.task_1;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Person(null, "Олегов", null));
        System.out.println(new Person("", "Олегов", ""));
        System.out.println(new Person("Петр", "Олегов", ""));
        System.out.println(new Person("Николай", "Олегов", "Владимирович"));
        System.out.println(new Person("Егор", "Максимов", "Денисович"));
    }
}
