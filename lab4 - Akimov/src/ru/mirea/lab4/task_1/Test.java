package ru.mirea.lab4.task_1;

public class Test {
    public static void main(String[] args) {
        Nameable car = new Car("Машина");
        Nameable country = new Country("Страна");

        // С использованием переопределения
        System.out.println(car.getNameUsingOverriding());
        System.out.println(country.getNameUsingOverriding());
        // С использованием default метода
        System.out.println(car.getNameUsingDefaultMethod());
        System.out.print(country.getNameUsingDefaultMethod());
    }
}