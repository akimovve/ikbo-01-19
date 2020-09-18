package ru.mirea.pr9.task_2;


public class LabClass {
    final private LabClassUi classUi;

    public LabClass() {
        this.classUi = new LabClassDriver();
    }

    public LabClassUi getClassUi() {
        return classUi;
    }

    @Override
    public String toString() {
        return classUi.toString();
    }
}
