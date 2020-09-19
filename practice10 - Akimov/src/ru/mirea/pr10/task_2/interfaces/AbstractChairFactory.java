package ru.mirea.pr10.task_2.interfaces;

import ru.mirea.pr10.task_2.data.FunctionalChair;
import ru.mirea.pr10.task_2.data.MagicChair;
import ru.mirea.pr10.task_2.data.VictorianChair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
