package ru.mirea.pr7.lists;

import ru.mirea.pr7.data.Play;

import java.util.*;

public class StackPlay extends Play<Stack<String>> {

    public StackPlay(boolean interactive) {
        super(interactive);
    }

    @Override
    public Stack<String> createGame(Scanner scanner) {
        Stack<String> cards = new Stack<>();
        Arrays.stream(Arrays.stream(
                scanner.nextLine().split(" "))
                .toArray())
                .map(Object::toString)
                .forEach(cards::push);
        Collections.reverse(cards);
        return cards;
    }

    @Override
    public Stack<String> createGame(List<String> list) {
        Stack<String> cards = new Stack<>();
        list.forEach(cards::push);
        Collections.reverse(cards);
        return cards;
    }

    @Override
    public void endOfTurn(Stack<String> to, Stack<String> from) {
        String element = to.pop();
        Collections.reverse(to);
        to.push(element);
        to.push(from.pop());
        Collections.reverse(to);
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
    public Boolean isFirstPlayerIsOutOfCards() {
        return firstPlayerCards.isEmpty();
    }

    @Override
    public Boolean isSecondPlayerIsOutOfCards() {
        return secondPlayerCards.isEmpty();
    }
}
