package ru.mirea.pr12.task_1;

public class Person {
    final private String name;
    final private String surname;
    final private String secondName;

    public Person(String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return
                new StringBuilder(surname)
                        .append(" ")
                        .append((name != null && !name.isEmpty())? name.charAt(0) + ".": "")
                        .append((secondName != null && !secondName.isEmpty())? secondName.charAt(0) + ".": "")
                        .toString();
    }
}
