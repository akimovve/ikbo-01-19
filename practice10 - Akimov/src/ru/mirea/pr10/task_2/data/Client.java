package ru.mirea.pr10.task_2.data;

import ru.mirea.pr10.task_2.interfaces.Chair;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Sitting on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
