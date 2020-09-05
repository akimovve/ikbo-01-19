package ru.mirea.pr3.task_4;

public class MovableTest {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(12, 4, 10, 23, 5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveDown();
        circle.moveLeft();
        circle.moveRight();
    }
}
