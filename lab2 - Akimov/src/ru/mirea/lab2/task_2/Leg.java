package ru.mirea.lab2.task_2;

public class Leg {
    private int footSize;

    public Leg(int footSize) {
        if (footSize <= 0) {
            throw new IllegalStateException("Size of foot is <= 0");
        }
        this.footSize = footSize;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Leg {" +
                "footSize=" + footSize +
                '}';
    }
}
