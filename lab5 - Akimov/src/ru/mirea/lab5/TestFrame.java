package ru.mirea.lab5;

import ru.mirea.lab5.data.Circle;
import ru.mirea.lab5.data.Shape;
import ru.mirea.lab5.data.Triangle;
import ru.mirea.lab5.data.Rectangle;

import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame {
    final int MIN_PARAM = 100;
    final int MAX_PARAM = 150;

    public TestFrame() {
        setLayout(null);
        setTitle("Shapes");
        setMinimumSize(new Dimension(1000, 700));
        setSize(1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Shape shape;
        for (int i = 0; i < 20; i++) {
            shape = randomShape();
            shape.setBounds(
                    (int) (Math.random() * (getWidth() - MAX_PARAM)),
                    (int) (Math.random() * (getHeight() - MAX_PARAM)),
                    (int) (MIN_PARAM + Math.random() * (MAX_PARAM - MIN_PARAM)),
                    (int) (MIN_PARAM + Math.random() * (MAX_PARAM - MIN_PARAM)));
            add(shape);
        }
        setVisible(true);
    }

    private Shape randomShape() {
        if (Math.random() > 0.5) {
            return new Rectangle();
        } else if (Math.random() > 0.5) {
            return new Circle();
        } else {
            return new Triangle();
        }
    }
}
