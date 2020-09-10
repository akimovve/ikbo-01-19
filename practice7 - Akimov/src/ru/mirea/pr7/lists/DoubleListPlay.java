package ru.mirea.pr7.lists;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import ru.mirea.pr7.data.Play;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DoubleListPlay extends Play<DoubleList> {
    public DoubleListPlay(boolean interactive) {
        super(interactive);
    }

    @Override
    public DoubleList createGame(Scanner scanner) {
        DoubleList cards = new DoubleArrayList();
        Arrays.stream(Arrays.stream(
                scanner.nextLine().split(" "))
                .toArray())
                .map(String::valueOf)
                .map(Double::parseDouble)
                .forEach(cards::add);
        return cards;
    }

    @Override
    public DoubleList createGame(List<String> list) {
        return null;
    }

    @Override
    public void endOfTurn(DoubleList to, DoubleList from) {
        to.add(to.removeDouble(0));
        to.add(from.removeDouble(0));
    }

    @Override
    public String getCardOfFirstPlayer() {
        return String.valueOf((int) firstPlayerCards.getDouble(0));
    }

    @Override
    public String getCardOfSecondPlayer() {
        return String.valueOf((int) secondPlayerCards.getDouble(0));
    }

    @Override
    public Boolean isFirstPlayerIsOutOfCards() {
        return firstPlayerCards.isEmpty();
    }

    @Override
    public Boolean isSecondPlayerIsOutOfCards() {
        return secondPlayerCards.isEmpty();
    }
}
