package ru.mirea.pr4.data;

public enum Base {
    MILAN_TEAM("A.C. Milan"),
    MADRID_TEAM("Real Madrid"),
    MILAN_PATH("src/ru/resources/milan.png"),
    MADRID_PATH("src/ru/resources/real_madrid.png");

    final public static int WIDTH = 1050;
    final public static int HEIGHT = 750;
    final public static int SCORE_TEXT_SIZE = 120;
    final public static int LABEL_TEXT_SIZE = 25;
    final private String obj;

    Base(String obj) {
        if (obj == null) {
            throw new NullPointerException("obj");
        }
        this.obj = obj;
    }

    public String obj() {
        return obj;
    }
}
