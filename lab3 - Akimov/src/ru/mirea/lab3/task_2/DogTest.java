package ru.mirea.lab3.task_2;

public class DogTest {
    public static void main(String[] args) {
        Dog poodle = new Poodle("Dolman");
        poodle.bark();
        poodle.walkingStyle();
        System.out.println(poodle);

        Dog bulldog = new Bulldog("Misha");
        bulldog.bark();
        bulldog.walkingStyle();
        System.out.println(bulldog);
    }
}
