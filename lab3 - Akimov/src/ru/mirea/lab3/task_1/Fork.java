package ru.mirea.lab3.task_1;

public class Fork extends Dish {
    private int length;
    private int weight;

    public Fork(int length, int weight) {
        super("FORK");
        this.length = length;
        this.weight = weight;
    }

    @Override
    public void wash() {
        System.out.printf("%s (len = %d; wei = %d) is washing now...%n", super.getType(), length, weight);
        super.setClean(true);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fork {" +
                "length=" + length +
                ", weight=" + weight +
                "}, " + super.toString();
    }
}
