package ru.mirea.pr7;

import ru.mirea.pr7.data.Play;
import ru.mirea.pr7.lists.StackPlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;

public class Interactive extends JFrame {
    private JLabel card1, card2, winner1, winner2;
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
        panels[1].add(nextBut, BorderLayout.CENTER);
        panels[1].add(resetBut, BorderLayout.SOUTH);
        panels[2].add(winner2, BorderLayout.NORTH);
        panels[2].add(card2, BorderLayout.CENTER);

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
        winner1 = new JLabel("WINNER", SwingConstants.CENTER);
        winner2 = new JLabel("WINNER", SwingConstants.CENTER);

        card1.setFont(new Font("Arial", Font.BOLD, 30));
        card2.setFont(new Font("Arial", Font.BOLD, 30));
        winner1.setFont(new Font("Arial", Font.BOLD, 30));
        winner2.setFont(new Font("Arial", Font.BOLD, 30));
        winner1.setVisible(false);
        winner2.setVisible(false);

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
        resetBut.setVisible(false);
    }

    private void nextCard() {
        // FIXME Баг за одно нажатие до выиграша (до конца игры)
        if (cards.compareCards()) {
            card1.setText(cards.getCardOfFirstPlayer());
            card2.setText(cards.getCardOfSecondPlayer());
        } else {
            resetBut.setVisible(true);
            if (cards.isSecondPlayerIsOutOfCards()) {
                winner1.setVisible(true);
            } else {
                winner2.setVisible(true);
            }
        }
    }

}
