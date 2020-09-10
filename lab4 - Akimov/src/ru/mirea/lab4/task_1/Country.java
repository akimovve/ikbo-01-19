package ru.mirea.lab4.task_1;

public class Country implements Nameable {
    private final String objName;

    public Country(String objName) {
        this.objName = objName;
    }

    @Override
    public String getNameUsingOverriding() {
        return this.objName;
    }
}