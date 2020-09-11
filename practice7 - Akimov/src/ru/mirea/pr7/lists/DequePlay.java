package ru.mirea.pr7.lists;

import ru.mirea.pr7.data.Play;

import java.util.*;

public class DequePlay extends Play<Deque<String>> {

    public DequePlay(boolean interactive) {
        super(interactive);
    }

    @Override
    public Deque<String> createGame(Scanner scanner) {
        Deque<String> cards = new LinkedList<>();
        Arrays.stream(Arrays.stream(
                scanner.nextLine().split(" "))
                .toArray())
                .map(Object::toString)
                .forEach(cards::addLast);
        return cards;
    }

    @Override
    public Deque<String> createGame(List<String> list) {
        return null;
    }

    @Override
    public void endOfTurn(Deque<String> to, Deque<String> from) {
        to.addLast(to.pollFirst());
        to.addLast(from.pollFirst());
    }

    @Override
    public String getCardOfFirstPlayer() {
        return firstPlayerCards.peekFirst();
    }

    @Override
    public String getCardOfSecondPlayer() {
        return secondPlayerCards.peekFirst();
    }

    @Override
    public Integer getNumOfFirstPlayerCards() {
        return firstPlayerCards.size();
    }

    @Override
    public Integer getNumOfSecondPlayerCards() {
        return secondPlayerCards.size();
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
