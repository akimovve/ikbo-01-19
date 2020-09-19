package ru.mirea.pr10.task_1;

public class Complex {
    private Integer real;
    private Integer image;

    public Complex(Integer real, Integer image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {}

    public Integer getReal() {
        return real;
    }

    public Integer getImage() {
        return image;
    }

    public void setReal(Integer real) {
        this.real = real;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex {" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
