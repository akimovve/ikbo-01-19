package ru.mirea.pr3.task_2;

public class Circle extends Shape {
    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Square's length
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                "}, " + super.toString();
    }
}
