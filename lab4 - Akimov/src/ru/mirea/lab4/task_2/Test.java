package ru.mirea.lab4.task_2;

public class Test {
    public static void main(String[] args) {
        Priceable car = new Car(1_200_000.0D);
        Priceable jacket = new Jacket(15_000.0D);

        System.out.println("Car: " + car.getPrice());
        System.out.print("Jacket: " + jacket.getPrice());
    }
}