package ru.mirea.pr9.task_2;

import ru.mirea.pr9.task_2.exceptions.EmptyStringException;
import ru.mirea.pr9.task_2.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
            throws EmptyStringException, StudentNotFoundException {
        LabClassUi classUi = new LabClass().getClassUi();

        classUi.addStudents(initStudents());
        // not sorted at all
        System.out.println(classUi);

        classUi.sortBySurname();
        // sorted by surname
        System.out.println(classUi);

        classUi.sortByMark();
        // sorted by mark
        System.out.println(classUi);

        // find by name, surname and second name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's info to find:");
        System.out.println(classUi.getStudentByName(scanner.next(), scanner.next(), scanner.next()));
    }

    private static List<Student> initStudents()
            throws EmptyStringException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Matt", "Divens", "Vella", 5));
        students.add(new Student("Bob", "Stevens", "Chern", 3));
        students.add(new Student("Ann", "Roberts", "Rern", 4));
        students.add(new Student("Kane", "Jacob", "Lynd", 5));
        // students.add(new Student("Mike", "Fern", "", 5));
        return students;
    }
}
