package ru.mirea.lab4.task_2;

public class Jacket implements Priceable {
    private final double jacketPrice;

    public Jacket(double jacketPrice) {
        this.jacketPrice = jacketPrice;
    }

    public double getPrice() {
        return this.jacketPrice;
    }
}