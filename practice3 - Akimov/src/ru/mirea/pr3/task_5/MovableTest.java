package ru.mirea.pr3.task_5;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 5, 15, 5, 2, 6);
        rectangle.moveUp();
        rectangle.moveDown();
        rectangle.moveDown();
        rectangle.moveRight();
        rectangle.moveLeft();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
