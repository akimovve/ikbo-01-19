package ru.mirea.pr2.task_2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball() {}

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXAndY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return String.format("Ball @ (%f, %f)", x, y);
    }
}
