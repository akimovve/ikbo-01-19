package ru.mirea.lab4.task_1;

public class Car implements Nameable {
    private final String objName;

    public Car(String objName) {
        this.objName = objName;
    }

    @Override
    public String getNameUsingOverriding() {
        return this.objName;
    }
}