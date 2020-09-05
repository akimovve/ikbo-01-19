package ru.mirea.lab3.task_3;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private String name;
    private List<Furniture> furnitureList;

    public FurnitureShop(String name) {
        this.name = name;
        this.furnitureList = new ArrayList<>();
    }

    public void addFurnitureToTheShop(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public String getName() {
        return name;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    @Override
    public String toString() {
        return "FurnitureShop {" +
                "name='" + name + '\'' +
                ", furnitureList=" + furnitureList +
                '}';
    }
}
