package ru.mirea.pr4;

import ru.mirea.pr4.data.Base;
import ru.mirea.pr4.model.FootballTeam;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class GamePlay extends JFrame {
    final private Logger log = Logger.getLogger(this.getName());
    final private FootballTeam firstTeam, secondTeam;
    private JLabel scoreOneLabel, scoreTwoLabel, gameResultLabel, lastGoalLabel, xLabel;

    public GamePlay(FootballTeam firstTeam, FootballTeam secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        initFrameElements();
    }

    private void initFrameElements() {
        JPanel panel = new JPanel(); // main
        panel.setLayout(new GridLayout(1, 3));

        initLabels();
        JPanel[] panels = new JPanel[3];
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new GridLayout(3, 1));
            panel.add(panels[i]);
        }
        panels[0].add(scoreOneLabel);
        panels[0].add(setLogo(firstTeam, scoreOneLabel));

        panels[1].add(xLabel);
        panels[1].add(gameResultLabel);
        panels[1].add(lastGoalLabel);

        panels[2].add(scoreTwoLabel);
        panels[2].add(setLogo(secondTeam, scoreTwoLabel));

        JFrame mainFrame = initMenuAndMainFrame();
        mainFrame.add(panel);
        mainFrame.getRootPane()
                .setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
        mainFrame.setSize(Base.WIDTH, Base.HEIGHT);
        mainFrame.setVisible(true);
    }

    private void initLabels() {
        scoreOneLabel = new JLabel("0", SwingConstants.CENTER);
        scoreTwoLabel = new JLabel("0", SwingConstants.CENTER);
        gameResultLabel = new JLabel("", SwingConstants.CENTER);
        lastGoalLabel = new JLabel("", SwingConstants.CENTER);
        xLabel = new JLabel("X", SwingConstants.CENTER);

        scoreOneLabel.setFont(new Font("Arial", Font.BOLD, Base.SCORE_TEXT_SIZE));
        scoreTwoLabel.setFont(new Font("Arial", Font.BOLD, Base.SCORE_TEXT_SIZE));
        gameResultLabel.setFont(new Font("Arial", Font.BOLD, Base.LABEL_TEXT_SIZE));
        lastGoalLabel.setFont(new Font("Arial", Font.BOLD, Base.LABEL_TEXT_SIZE));
        xLabel.setFont(new Font("Arial", Font.BOLD, 100));
    }

    private JFrame initMenuAndMainFrame() {
        JFrame jFrame = new JFrame("Football games");
        jFrame.setLayout(new GridLayout(1, 1));

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Info");
        menuBar.add(menu);

        JMenuItem resetItem = new JMenuItem();
        resetItem.setText("Reset game");
        resetItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                firstTeam.resetGame();
                secondTeam.resetGame();
                resetLabels();
            }
        });

        JMenuItem finishItem = new JMenuItem();
        finishItem.setText("Finish game");
        finishItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                gameResultLabel.setText(settingWinner());
                lastGoalLabel.setText(settingLastGoal());
                firstTeam.resetGame();
                secondTeam.resetGame();
            }
        });
        menu.add(resetItem);
        menu.add(finishItem);
        menuBar.add(menu);

        jFrame.add(menuBar);
        jFrame.setJMenuBar(menuBar);
        return jFrame;
    }

    private String settingWinner() {
        String response = "WINNER: ";
        if (firstTeam.getGoals() > secondTeam.getGoals()) {
            return response + firstTeam.getName();
        }
        if (secondTeam.getGoals() > firstTeam.getGoals()) {
            return response + secondTeam.getName();
        }
        return "DRAW!";
    }

    private String settingLastGoal() {
        String response = "Last scorer: ";
        if (firstTeam.getGoals() == 0 && secondTeam.getGoals() == 0) {
            return response + "N/A";
        }
        return response + (firstTeam.isLastGoal()? firstTeam.getName() : secondTeam.getName());
    }

    private void resetLabels() {
        scoreOneLabel.setText("0");
        scoreTwoLabel.setText("0");
        gameResultLabel.setText("");
        lastGoalLabel.setText("");
    }

    private JButton setLogo(FootballTeam team, JLabel label) {
        JButton button = new JButton();
        try {
            BufferedImage logo = ImageIO.read(new File(team.getLogoPath()));
            button.setIcon(new ImageIcon(logo));
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (team.isGameFinished()) {
                        firstTeam.setGameFinished(false);
                        secondTeam.setGameFinished(false);
                        resetLabels();
                    }
                    team.goal();
                    label.setText(String.valueOf(team.getGoals()));
                    if (team.getName().equals(firstTeam.getName())) {
                        firstTeam.setLastGoal(true);
                        secondTeam.setLastGoal(false);
                    } else {
                        firstTeam.setLastGoal(false);
                        secondTeam.setLastGoal(true);
                    }
                }
            });
        } catch (IOException e) {
            log.warning("Unable to get an image.");
        }
        return button;
    }
}
