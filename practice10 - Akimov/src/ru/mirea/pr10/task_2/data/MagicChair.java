package ru.mirea.pr10.task_2.data;

import ru.mirea.pr10.task_2.interfaces.Chair;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Magic chair is doing magic...");
    }

    @Override
    public String toString() {
        return "Magic chair";
    }
}
