package ru.mirea.pr7;

import ru.mirea.pr7.data.Play;
import ru.mirea.pr7.lists.StackPlay;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;
import javax.swing.*;

public class Interactive<T> extends JFrame {
    private JLabel card1, card2, winner1, winner2, left1, left2, botva;
    private JButton nextBut, resetBut;
    private Play<Stack<String>> cards;

    public Interactive() {
        cards = new StackPlay(true);
        initWindow();
    }

    private void initWindow() {
        setLayout(new GridLayout(1, 3));

        initElements();
        JPanel[] panels = new JPanel[3];
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            add(panels[i]);
        }

        panels[0].add(winner1, BorderLayout.NORTH);
        panels[0].add(card1, BorderLayout.CENTER);
        panels[0].add(left1, BorderLayout.SOUTH);
        panels[1].add(botva, BorderLayout.NORTH);
        panels[1].add(nextBut, BorderLayout.CENTER);
        panels[1].add(resetBut, BorderLayout.SOUTH);
        panels[2].add(winner2, BorderLayout.NORTH);
        panels[2].add(card2, BorderLayout.CENTER);
        panels[2].add(left2, BorderLayout.SOUTH);

        getRootPane().setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(450, 250));
        setSize(450, 250);
        setVisible(true);
    }

    private void initElements() {
        card1 = new JLabel(cards.getCardOfFirstPlayer(), SwingConstants.CENTER);
        card2 = new JLabel(cards.getCardOfSecondPlayer(), SwingConstants.CENTER);
        winner1 = new JLabel("", SwingConstants.CENTER);
        winner2 = new JLabel("", SwingConstants.CENTER);
        left1 = new JLabel("Left: " + cards.getNumOfFirstPlayerCards(), SwingConstants.CENTER);
        left2 = new JLabel("Left: " + cards.getNumOfSecondPlayerCards(), SwingConstants.CENTER);
        botva = new JLabel("BOTVA", SwingConstants.CENTER);

        card1.setFont(new Font("Arial", Font.BOLD, 60));
        card2.setFont(new Font("Arial", Font.BOLD, 60));
        winner1.setFont(new Font("Arial", Font.BOLD, 25));
        winner2.setFont(new Font("Arial", Font.BOLD, 25));
        winner1.setVisible(false);
        winner2.setVisible(false);
        left1.setFont(new Font("Arial", Font.BOLD, 20));
        left2.setFont(new Font("Arial", Font.BOLD, 20));
        botva.setFont(new Font("Arial", Font.BOLD, 25));
        botva.setVisible(false);

        resetBut = new JButton("Reset");
        resetBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                resetGame();
            }
        });
        resetBut.setVisible(false);

        nextBut = new JButton("Next");
        nextBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                nextCard();
            }
        });
    }

    private void resetGame() {
        cards = new StackPlay(true);
        card1.setText(cards.getCardOfFirstPlayer());
        card2.setText(cards.getCardOfSecondPlayer());
        winner1.setVisible(false);
        winner2.setVisible(false);
        botva.setVisible(false);
        decrLeftCards();
        resetBut.setVisible(false);
    }

    private void nextCard() {
        if (cards.compareCards()) {
            if (!cards.isFirstPlayerIsOutOfCards()) {
                card1.setText(cards.getCardOfFirstPlayer());
                decrLeftCards();
            } else {
                winner2.setText("WINNER " + cards.getCounter());
                winner2.setVisible(true);
                resetBut.setVisible(true);
            }
            if (!cards.isSecondPlayerIsOutOfCards()) {
                card2.setText(cards.getCardOfSecondPlayer());
                decrLeftCards();
            } else {
                winner1.setText("WINNER " + cards.getCounter());
                winner1.setVisible(true);
                resetBut.setVisible(true);
            }
        } else if (cards.getCounter() >= 106) {
            botva.setVisible(true);
            resetBut.setVisible(true);
        }
    }

    private void decrLeftCards() {
        left1.setText("Left: " + cards.getNumOfFirstPlayerCards());
        left2.setText("Left: " + cards.getNumOfSecondPlayerCards());
    }
}
