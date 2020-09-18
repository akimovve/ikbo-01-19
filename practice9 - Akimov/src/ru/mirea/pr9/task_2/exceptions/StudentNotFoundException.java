package ru.mirea.pr9.task_2.exceptions;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String info) {
        super(info + " was not found.");
    }
}
