package ru.mirea.lab16.interfaces;

import ru.mirea.lab16.models.MenuItem;

public interface OrdersManager {
	int itemsQuantity(String itemName);

	int itemsQuantity(MenuItem item);

	Orderable[] getOrders();

	int ordersCostSummary();

	int ordersQuantity();
}
