package ru.mirea.lab3.task_1;

public class DishTest {
    public static void main(String[] args) {
        Dish plate = new Plate("Soup");
        System.out.println(plate);
        plate.wash();
        System.out.println(plate);
        plate.setClean(false);
        plate.setType("Plate");
        System.out.println(plate);

        Dish fork = new Fork(12, 1);
        System.out.println(fork);
        fork.wash();
        System.out.println(fork);
        fork.setClean(false);
        fork.setType("Fork");
        System.out.println(fork);
    }
}
