package ru.mirea.lab5.data;

import java.awt.*;

public class Triangle extends Shape {

    public Triangle() {
        super();
    }

    public Triangle(Color shapeColor) {
        super(shapeColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.setPaint(getShapeColor());
        Polygon triangle = new Polygon();
        triangle.addPoint(getShapeX() + (getWidth() / 2), getShapeY());
        triangle.addPoint(getShapeX(), getShapeY() + getHeight());
        triangle.addPoint(getShapeX() + getWidth(), getShapeY() + getHeight());
        graphics.fill(triangle);
    }
}
