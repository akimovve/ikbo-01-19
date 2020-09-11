package ru.mirea.pr7.data;

import java.util.*;

public abstract class Play<T> implements Playable<T> {
    private int counter;
    protected T firstPlayerCards;
    protected T secondPlayerCards;

    public Play(boolean interactive) {
        counter = 0;
        if (interactive) {
            forInteractive();
            return;
        }
        Scanner scanner = new Scanner(System.in);
        firstPlayerCards = createGame(scanner);
        secondPlayerCards = createGame(scanner);
    }

    public void play() {
        while (!isFirstPlayerIsOutOfCards() && !isSecondPlayerIsOutOfCards() && counter < 106) {
            compareCards();
        }
        System.out.println(counter == 106 ? "botva" : (isSecondPlayerIsOutOfCards()? "first " : "second ") + counter);
    }

    public boolean compareCards() {
        if (isFirstPlayerIsOutOfCards() || isSecondPlayerIsOutOfCards() || counter > 106) {
            return false;
        }
        String card1 = getCardOfFirstPlayer();
        String card2 = getCardOfSecondPlayer();
        if ((card1.compareTo(card2) > 0 || (card1.equals("0") && card2.equals("9")))
                && (!card1.equals("9") || !card2.equals("0"))) {
            endOfTurn(firstPlayerCards, secondPlayerCards);
        } else {
            endOfTurn(secondPlayerCards, firstPlayerCards);
        }
        counter++;
        return true;
    }

    private void forInteractive() {
        List<String> temp = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            temp.add(String.valueOf(i));
        }
        Collections.shuffle(temp);
        firstPlayerCards = createGame(temp.subList(0, temp.size() / 2));
        secondPlayerCards = createGame(temp.subList(temp.size() / 2, temp.size()));
    }

    public int getCounter() {
        return counter;
    }
}