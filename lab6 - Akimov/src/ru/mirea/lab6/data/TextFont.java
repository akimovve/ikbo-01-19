package ru.mirea.lab6.data;

import java.awt.*;
import java.util.Arrays;

public enum TextFont {
    TNR("Times New Roman"),
    MSS("MS Sans Serif"),
    CN("Courier New");

    final private String obj;

    TextFont(String obj) {
        this.obj = obj;
    }

    public String obj() {
        return obj;
    }

    public static TextFont fromObj(String obj) {
        return Arrays.stream(TextFont.values())
                .filter(el -> el.obj.equals(obj))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public Font font() {
        switch (this) {
            case TNR:
                return new Font(TNR.obj, Font.BOLD, 28);
            case MSS:
                return new Font(MSS.obj, Font.BOLD, 28);
            case CN:
                return new Font(CN.obj, Font.BOLD, 28);
            default:
                throw new IllegalArgumentException();
        }
    }
}
