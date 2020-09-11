package ru.mirea.pr7.data;

import java.util.List;
import java.util.Scanner;

public interface Playable<T> {
    T createGame(Scanner scanner);
    T createGame(List<String> list);
    void endOfTurn(T to, T from);
    String getCardOfFirstPlayer();
    String getCardOfSecondPlayer();
    Integer getNumOfFirstPlayerCards();
    Integer getNumOfSecondPlayerCards();
    Boolean isFirstPlayerIsOutOfCards();
    Boolean isSecondPlayerIsOutOfCards();
}
