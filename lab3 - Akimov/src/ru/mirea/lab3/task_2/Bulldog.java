package ru.mirea.lab3.task_2;

public class Bulldog extends Dog {
    public Bulldog(String name) {
        super(name, "Bulldog");
    }

    @Override
    public void walkingStyle() {
        System.out.println(super.getBreed() + " " + super.getName() + " walks aggressively.");
    }
}
