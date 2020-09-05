package ru.mirea.lab3.task_1;

public abstract class Dish {
    private String type;
    private boolean clean;

    public Dish(String type) {
        this.type = type;
        this.clean = false;
    }

    public abstract void wash();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    @Override
    public String toString() {
        return "Dish {" +
                "type='" + type + '\'' +
                ", clean=" + clean +
                '}';
    }
}
