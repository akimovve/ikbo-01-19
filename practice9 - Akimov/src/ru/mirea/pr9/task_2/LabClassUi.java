package ru.mirea.pr9.task_2;

import ru.mirea.pr9.task_2.exceptions.EmptyStringException;
import ru.mirea.pr9.task_2.exceptions.StudentNotFoundException;

import java.util.List;

public interface LabClassUi {
    List<Student> students();
    void addStudent(Student student) throws EmptyStringException;
    void addStudents(List<Student> students);
    void sortBySurname();
    void sortByMark();
    Student getStudentByName(String name, String surname, String secondName) throws StudentNotFoundException;
}
