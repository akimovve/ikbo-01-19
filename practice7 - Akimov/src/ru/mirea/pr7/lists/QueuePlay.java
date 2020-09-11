package ru.mirea.pr7.lists;

import ru.mirea.pr7.data.Play;

import java.util.*;

public class QueuePlay extends Play<Queue<String>> {

    public QueuePlay(boolean interactive) {
        super(interactive);
    }

    @Override
    public Queue<String> createGame(Scanner scanner) {
        Queue<String> cards = new LinkedList<>();
        Arrays.stream(Arrays.stream(
                scanner.nextLine().split(" "))
                .toArray())
                .map(Object::toString)
                .forEach(cards::add);
        return cards;
    }

    @Override
    public Queue<String> createGame(List<String> list) {
        return null;
    }

    @Override
    public void endOfTurn(Queue<String> to, Queue<String> from) {
        to.add(to.poll());
        to.add(from.poll());
    }

    @Override
    public String getCardOfFirstPlayer() {
        return firstPlayerCards.peek();
    }

    @Override
    public String getCardOfSecondPlayer() {
        return secondPlayerCards.peek();
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
