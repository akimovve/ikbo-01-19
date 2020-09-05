package ru.mirea.lab2.task_1;

public class Circle {
    private double radius;
    private double square;
    private double length;

    public Circle(double radius) {
        setDefaultProperties(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

    public double getLength() {
        return length;
    }

    public void setRadius(double radius) {
        setDefaultProperties(radius);
        this.radius = radius;
    }

    private void setDefaultProperties(double radius) {
        if (radius <= 0) {
            throw new IllegalStateException(String.format("Radius %f is <= 0", radius));
        }
        this.square = Math.PI * Math.pow(radius, 2);
        this.length = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius +
                ", square = " + square +
                ", length = " + length;
    }
}
