package ru.mirea.pr9.task_1;

public class Test {
    public static void main(String[] args)
            throws IllegalInnException {
        Client client1 = new Client("Oleg", "Olegov", "Olegovich", "023910482947");
        System.out.println(client1);
        Client client2 = new Client("Petr", "Petrov", "Petrovich", "1234567890");
        System.out.println(client2);
    }
}
