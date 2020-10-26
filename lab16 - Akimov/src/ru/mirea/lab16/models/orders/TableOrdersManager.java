package ru.mirea.lab16.models.orders;

import ru.mirea.lab16.interfaces.Orderable;
import ru.mirea.lab16.interfaces.OrdersManager;
import ru.mirea.lab16.models.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOrdersManager implements OrdersManager {
	Orderable[] orders = new Orderable[10];

	@Override
	public int itemsQuantity(String itemName) {
		int count = 0;
		for (Orderable order : orders)
			count += order.itemQuantity(itemName);
		return count;
	}

	@Override
	public int itemsQuantity(MenuItem item) {
		return itemsQuantity(item.getName());
	}

	@Override
	public Orderable[] getOrders() {
		return orders;
	}

	@Override
	public int ordersCostSummary() {
		return Arrays.stream(getOrders())
				.mapToInt(Orderable::costTotal)
				.sum();
	}

	@Override
	public int ordersQuantity() {
		return orders.length;
	}

	public void add(Orderable order, int tableNumber) {
		orders[tableNumber] = order;
	}

	public void addItem(MenuItem item, int tableNumber) {
		orders[tableNumber].add(item);
	}

	public int freeTableNumber() {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] == null)
				return i;
		}
		return -1;
	}

	public int[] freeTableNumbers() {
		List<Integer> arrayListNumbers = new ArrayList<>();
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] == null)
				arrayListNumbers.add(i);
		}
		int[] arrNumbers = new int[arrayListNumbers.size()];
		for (int i = 0; i < arrNumbers.length; i++)
			arrNumbers[i] = arrayListNumbers.get(i);
		return arrNumbers;
	}

	public Orderable getOrder(int tableNumber) {
		return orders[tableNumber];
	}

	void remove(int tableNumber) {
		orders[tableNumber] = null;
	}

	int remove(Orderable order) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equals(order)) {
				orders[i] = null;
				return i;
			}
		}
		return -1;
	}

	int removeAll(Orderable order) {
		int count = 0;
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equals(order)) {
				orders[i] = null;
				count++;
			}
		}
		return count;
	}
}
