package ru.mirea.lab6.data;

import java.awt.*;
import java.util.Arrays;

public enum TextColor {
    BLUE("Синий"),
    RED("Красный"),
    BLACK("Чёрный");

    final private String obj;

    TextColor(String obj) {
        this.obj = obj;
    }

    public String obj() {
        return obj;
    }

    public static TextColor fromObj(String obj) {
        return Arrays.stream(TextColor.values())
                .filter(el -> el.obj.equals(obj))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public Color color() {
        switch (this) {
            case BLUE:
                return Color.BLUE;
            case RED:
                return Color.RED;
            case BLACK:
                return Color.BLACK;
            default:
                throw new IllegalArgumentException();
        }
    }
}
