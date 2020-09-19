package ru.mirea.pr10.task_2.data;

import ru.mirea.pr10.task_2.interfaces.Chair;

public class VictorianChair implements Chair {
    private Integer age;

    public VictorianChair(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Victorian chair at age "
                + age;
    }
}
