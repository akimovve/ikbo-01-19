package ru.mirea.lab3.task_3;

import java.math.BigDecimal;

public class CupBoard extends Furniture {
    private Integer height;
    private Integer width;

    public CupBoard(BigDecimal price, Long number, Integer height, Integer width) {
        super(price, number);
        this.height = height;
        this.width = width;
    }

    /**
     * Some logic exclusively for cupboard
     */
    @Override
    public String info() {
        if (super.getNumber() == 0) {
            return "No cupboards anymore.";
        }
        if (height > width) {
            return String.format("In cupboard height (%d) is more than width (%d)", height, width);
        }
        return String.format("In cupboard width (%d) is more than height (%d)", width, height);
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "CupBoard {" +
                "height = " + height +
                ", width = " + width +
                ", price = " + super.getPrice() +
                ", left = " + super.getNumber() +
                '}';
    }
}
