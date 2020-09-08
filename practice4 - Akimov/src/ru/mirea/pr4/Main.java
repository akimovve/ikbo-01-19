package ru.mirea.pr4;

import ru.mirea.pr4.data.Base;
import ru.mirea.pr4.model.FootballTeam;

public class Main {
    public static void main(String[] args) {
        FootballTeam milanTeam = new FootballTeam(Base.MILAN_TEAM.obj(), Base.MILAN_PATH.obj());
        FootballTeam realMadridTeam = new FootballTeam(Base.MADRID_TEAM.obj(), Base.MADRID_PATH.obj());
        new GamePlay(milanTeam, realMadridTeam);
    }
}
