package ru.mirea.lab2.task_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        circle.setRadius(13.6);
        System.out.println(circle);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Length: " + circle.getLength());
    }
}
