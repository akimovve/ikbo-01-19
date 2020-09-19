package ru.mirea.pr10.task_2.data;

import ru.mirea.pr10.task_2.interfaces.Chair;

public class FunctionalChair implements Chair {

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Functional chair";
    }
}
