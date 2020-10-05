package ru.mirea.pr16.handlers;

import ru.mirea.pr16.collections.OwnLinkedList;
import ru.mirea.pr16.models.Item;
import ru.mirea.pr16.models.Order;

import java.util.Arrays;
import java.util.Collection;

public class OrderManager implements Order {
    private OwnLinkedList<Item> data;

    public OrderManager() {
        this.data = new OwnLinkedList<>();
    }

    public OrderManager(Collection<Item> collection) {
        this.data = new OwnLinkedList<>(collection);
    }

    @Override
    public boolean add(Item item) {
        return data.add(item);
    }

    @Override
    public boolean delete(String name) {
        Item item = Arrays.stream(
                data.toArray())
                .filter(i -> i.getName().equals(name))
                .findFirst()
                .orElse(null);
        if (item == null)
            return false;
        return data.remove(item);
    }

    @Override
    public int deleteAll(String name) {
        return (int) Arrays.stream(
                data.toArray())
                .filter(i -> i.getName().equals(name))
                .map(el -> data.remove(el))
                .count();
    }

    @Override
    public int numOfOrders() {
        return data.getSize();
    }

    @Override
    public Object[] getArray() {
        return data.toArray();
    }

    @Override
    public double getSumPrice() {
        return (int) Arrays.stream(
                data.toArray())
                .mapToDouble(Item::getPrice)
                .sum();
    }

    @Override
    public Object[] getArrayOfNames() {
        return  Arrays.stream(
                data.toArray())
                .map(Item::getName)
                .toArray();
    }

    @Override
    public Object[] getSortedArray() {
        return Arrays.stream(
                data.toArray())
                .sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()))
                .toArray();
    }
}
