package ru.mirea.lab3.task_3;

import java.math.BigDecimal;

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop("Stolplit");
        shop.addFurnitureToTheShop(new CupBoard(
                new BigDecimal("55.50"),
                (long) 123,
                10,
                3));
        shop.addFurnitureToTheShop(new CupBoard(
                new BigDecimal("70.90"),
                (long) 2,
                12,
                4));
        shop.addFurnitureToTheShop(new Sofa(
                new BigDecimal("35.90"),
                (long) 5,
                "Brown"));
        System.out.println(shop);

        System.out.println(shop.getFurnitureList().get(2).info());
        for (int i = 1; i <= 6; i++) {
            shop.getFurnitureList().get(2).send();
            System.out.println(i + ") " + shop);
        }
        System.out.println(shop.getFurnitureList().get(2).info());
    }
}
