package ru.mirea.pr10.task_2;

import ru.mirea.pr10.task_2.data.Client;
import ru.mirea.pr10.task_2.factories.ChairFactory;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setChair(new ChairFactory().createFunctionalChair());
        client.sit();
        client.setChair(new ChairFactory().createMagicChair());
        client.sit();
        client.setChair(new ChairFactory().createVictorianChair());
        client.sit();
    }
}
