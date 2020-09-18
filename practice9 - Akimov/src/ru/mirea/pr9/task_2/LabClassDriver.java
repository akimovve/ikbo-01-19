package ru.mirea.pr9.task_2;

import ru.mirea.pr9.task_2.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LabClassDriver implements LabClassUi {
    private List<Student> students;

    public LabClassDriver() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> students() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    @Override
    public void sortBySurname() {
        students.sort(Comparator.comparing(Student::getSurname));
    }

    @Override
    public void sortByMark() {
        students =
                students.stream()
                        .sorted()
                        .collect(Collectors.toList());
    }

    @Override
    public Student getStudentByName(
            String name,
            String surname,
            String secondName)
            throws StudentNotFoundException {
        return students.stream().filter(st ->
                st.getName().equals(name)
                        && st.getSurname().equals(surname)
                        && st.getSecondName().equals(secondName))
                .findFirst()
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                String.format("%s %s %s", name, surname, secondName)));
    }

    @Override
    public String toString() {
        StringBuilder sb =
                new StringBuilder("----------------------------List of students----------------------------\n");
        students.forEach(el -> sb.append(el).append("\n"));
        return sb.toString();
    }
}
