package ru.mirea.lab3.task_3;

import java.math.BigDecimal;

public abstract class Furniture {
    private BigDecimal price;
    private Long number;

    public Furniture(BigDecimal price, Long number) {
        this.price = price;
        this.number = number;
    }

    public abstract String info();

    public void send() {
        if (number > 0) {
            number--;
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Furniture {" +
                "price=" + price +
                ", number=" + number +
                '}';
    }
}
