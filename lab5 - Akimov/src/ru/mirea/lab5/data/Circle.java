package ru.mirea.lab5.data;

import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        super();
    }

    public Circle(Color shapeColor) {
        super(shapeColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.setPaint(getShapeColor());
        graphics.fillOval(getShapeX(), getShapeY(), getWidth(), getHeight());
    }
}
