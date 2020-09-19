package ru.mirea.pr10.task_2.factories;

import ru.mirea.pr10.task_2.data.FunctionalChair;
import ru.mirea.pr10.task_2.data.MagicChair;
import ru.mirea.pr10.task_2.data.VictorianChair;
import ru.mirea.pr10.task_2.interfaces.AbstractChairFactory;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(213);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
