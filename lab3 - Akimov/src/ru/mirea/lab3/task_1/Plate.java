package ru.mirea.lab3.task_1;

public class Plate extends Dish {
    private String usesFor;

    public Plate(String usesFor) {
        super("PLATE");
        this.usesFor = usesFor;
    }

    @Override
    public void wash() {
        System.out.printf("%s (for %s) is washing now...%n", super.getType(), usesFor);
        super.setClean(true);
    }

    public String getUsesFor() {
        return usesFor;
    }

    public void setUsesFor(String usesFor) {
        this.usesFor = usesFor;
    }

    @Override
    public String toString() {
        return "Plate {" +
                "usesFor='" + usesFor + '\'' +
                "}, " + super.toString();
    }
}
