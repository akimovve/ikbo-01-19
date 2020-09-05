package ru.mirea.lab2.task_2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Petr", "Petrov", 20,
                new Head("blue", "blond", 2),
                new Hand(45.991),
                new Leg(43));
        System.out.println("1) " + human + "\n");
        human.setHead(new Head("green", "dark", 1));
        human.setSurname("Sergeev");
        human.setLeg(new Leg(40));
        System.out.println("2) " + human + "\n");
        human.getHead().setHairColor("orange");
        System.out.println("3) " + human);
    }
}
