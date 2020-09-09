package ru.mirea.pr6.task_2;

public class Student implements Comparable<Student> {
    final private long id;
    final private int gpa;

    public Student(long id, int gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getGpa(), o.getGpa());
    }

    public long getId() {
        return id;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
