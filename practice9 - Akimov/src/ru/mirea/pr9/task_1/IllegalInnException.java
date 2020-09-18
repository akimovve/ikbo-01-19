package ru.mirea.pr9.task_1;

public class IllegalInnException extends Exception {
    public IllegalInnException() {
        super("В ИНН должно содержаться 12 цифр.");
    }
}
