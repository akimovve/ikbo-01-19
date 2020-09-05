package ru.mirea.pr1;

public class Ball {
    private String color;
    private double weight;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
