package ru.mirea.pr16.models;

public interface Order {
    boolean add(Item item);
    boolean delete(String name);
    int deleteAll(String name);
    int numOfOrders();
    Object[] getArray();
    double getSumPrice();
    Object[] getArrayOfNames();
    Object[] getSortedArray();
}
