package ru.mirea.pr4.model;

public class FootballTeam {
    final private String name;
    final private String logoPath;
    private int goals;
    private boolean gameFinished;
    private boolean lastGoal;

    public FootballTeam(String name, String logoPath) {
        this.name = name;
        this.logoPath = logoPath;
        goals = 0;
        gameFinished = true;
        lastGoal = false;
    }

    public void resetGame() {
        goals = 0;
        gameFinished = true;
    }

    public void goal() {
        goals++;
    }

    public String getName() {
        return name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public int getGoals() {
        return goals;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        this.gameFinished = gameFinished;
    }

    public boolean isLastGoal() {
        return lastGoal;
    }

    public void setLastGoal(boolean lastGoal) {
        this.lastGoal = lastGoal;
    }
}
