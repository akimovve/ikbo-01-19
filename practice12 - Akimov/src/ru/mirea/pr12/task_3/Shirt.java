package ru.mirea.pr12.task_3;

public class Shirt {
    final private String code;
    final private String name;
    final private String color;
    final private String size;
    final static int ELEMENT_NUM = 4;

    public Shirt(String string) {
        String[] response = string.split(",");
        if (response.length != ELEMENT_NUM)
            throw new IllegalStateException("Неправильно введены исходные данные");
        this.code = response[0];
        this.name = response[1];
        this.color = response[2];
        this.size = response[3];
    }

    @Override
    public String toString() {
        return String.format(
                "code = %s\nname = %s\ncolor = %s\nsize = %s",
                code, name, color, size);
    }
}
