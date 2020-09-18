package ru.mirea.pr9.task_2;

import ru.mirea.pr9.task_2.exceptions.EmptyStringException;

public class Student implements Comparable<Student> {
    final private String name;
    final private String surname;
    final private String secondName;
    final private Integer mark;

    public Student(String name, String surname, String secondName, Integer mark)
            throws EmptyStringException {
        if (name.isEmpty() || surname.isEmpty() || secondName.isEmpty())
            throw new EmptyStringException();
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.mark = mark;
    }

    public Integer getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public int compareTo(Student o) {
        return mark.compareTo(o.getMark());
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", mark = " + mark +
                '}';
    }
}
