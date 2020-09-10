package ru.mirea.lab4.task_2;

public class Car implements Priceable {
    private final double carPrice;

    public Car(double carPrice) {
        this.carPrice = carPrice;
    }

    public double getPrice() {
        return this.carPrice;
    }
}