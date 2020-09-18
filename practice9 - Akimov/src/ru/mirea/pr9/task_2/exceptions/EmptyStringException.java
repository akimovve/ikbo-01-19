package ru.mirea.pr9.task_2.exceptions;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("You didn't enter student's personal info.");
    }
}
