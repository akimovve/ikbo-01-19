package ru.mirea.lab3.task_2;

public class Poodle extends Dog {
    public Poodle(String name) {
        super(name, "Poodle");
    }

    @Override
    public void walkingStyle() {
        System.out.println(super.getBreed() + " " + super.getName() + " walks happily.");
    }
}
