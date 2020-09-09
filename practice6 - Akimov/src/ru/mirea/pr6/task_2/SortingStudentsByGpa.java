package ru.mirea.pr6.task_2;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}
