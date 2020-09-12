package ru.mirea.lab5.data;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JComponent {
    final private int shapeX;
    final private int shapeY;
    final private Color shapeColor;

    public Shape() {
        this.shapeX = getX();
        this.shapeY = getY();
        this.shapeColor = generateColor();
    }

    public Shape(Color shapeColor) {
        this.shapeX = getX();
        this.shapeY = getY();
        this.shapeColor = shapeColor;
    }

    private Color generateColor() {
        Random random = new Random();
        return new Color(
                random.nextFloat(),
                random.nextFloat(),
                random.nextFloat());
    }

    public int getShapeX() {
        return shapeX;
    }

    public int getShapeY() {
        return shapeY;
    }

    public Color getShapeColor() {
        return shapeColor;
    }
}
