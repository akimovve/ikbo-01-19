package ru.mirea.pr2.task_2;

public class TestBall {
    public static void main(String[] args) {
        // init via constructor
        Ball ball1 = new Ball(147.100338, 1276.182915);
        System.out.println("1 init: " + ball1);
        ball1.move(-101.105902, 0.007911);
        System.out.println("after move: " + ball1);
        ball1.setXAndY(404.529208, 71.008123);
        System.out.println("change coordinates: " + ball1);

        // without init
        Ball ball2 = new Ball();
        System.out.println("2 without init: " + ball2);
        ball2.setX(123.77709);
        ball2.setY(1793.914);
        System.out.println("2 init: " + ball2);
        ball2.move(1000, -1750.819);
        System.out.println(ball2);
    }
}
