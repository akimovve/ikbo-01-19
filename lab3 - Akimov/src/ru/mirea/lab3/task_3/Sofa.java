package ru.mirea.lab3.task_3;

import java.math.BigDecimal;

public class Sofa extends Furniture {
    private String color;

    public Sofa(BigDecimal price, Long number, String color) {
        super(price, number);
        this.color = color;
    }

    /**
     * Some logic exclusively for sofa
     */
    @Override
    public String info() {
        if (super.getNumber() == 1) {
            return String.format("Last sofa with %s color!", color);
        }
        return String.format("Sofa with %s color. %d left.", color, super.getNumber());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa {" +
                "color='" + color + '\'' +
                ", price = " + super.getPrice() +
                ", left = " + super.getNumber() +
                '}';
    }
}
