package ru.mirea.pr9.task_1;

public class Client {
    final private String name;
    final private String surname;
    final private String secondName;
    final private String inn;

    public Client(String name, String surname, String secondName, String inn)
            throws IllegalInnException {
        if (inn.length() != 12)
            throw new IllegalInnException();
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Client {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
