package ru.mirea.pr3.task_4;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += 10 * ySpeed;
        System.out.println("moveUp(): " + this);
    }

    @Override
    public void moveDown() {
        this.y -= 10 * ySpeed;
        System.out.println("moveDown(): " + this);
    }

    @Override
    public void moveLeft() {
        this.x -= 10 * xSpeed;
        System.out.println("moveLeft(): " + this);
    }

    @Override
    public void moveRight() {
        this.x += 10 * xSpeed;
        System.out.println("moveRight(): " + this);
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
