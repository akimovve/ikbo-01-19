package ru.mirea.lab1;

public class Ball {
    private final String color;
    private final double weight;

    public Ball(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
