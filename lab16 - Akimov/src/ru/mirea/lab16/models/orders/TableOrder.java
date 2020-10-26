package ru.mirea.lab16.models.orders;

import ru.mirea.lab16.interfaces.Orderable;
import ru.mirea.lab16.models.Customer;
import ru.mirea.lab16.models.MenuItem;

import java.util.Arrays;

public class TableOrder implements Orderable {
	private Customer customer;
	private int size;
	private MenuItem[] items = new MenuItem[10];

	@Override
	public boolean add(MenuItem item) {
		try {
			if (size >= items.length) {
				MenuItem[] copy = items.clone();
				items = new MenuItem[size * 2];
				System.arraycopy(copy, 0, items, 0, copy.length);
			}
			items[size] = item;
			size++;
		} catch (Exception e) {
			System.out.println("Error adding element (table): " + e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String[] itemsNames() {
		String[] names = new String[items.length];
		for (int i = 0; i < items.length; i++)
			names[i] = items[i].getName();
		return names;
	}

	@Override
	public int itemsQuantity() {
		return size;
	}

	@Override
	public int itemQuantity(String itemName) {
		int count = 0;
		for (MenuItem item : items) {
			if (item.getName().equals(itemName))
				count++;
		}
		return count;
	}

	@Override
	public int itemQuantity(MenuItem itemName) {
		return itemQuantity(itemName.getName());
	}

	@Override
	public MenuItem[] getItems() {
		return items;
	}

	@Override
	public boolean remove(String itemName) {
		boolean removed = false;
		int index = items.length;
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(itemName)) {
				index = i + 1;
				items[i] = null;
				removed = true;
				break;
			}
		}
		if (items.length - 1 - index >= 0)
			System.arraycopy(items, index + 1, items, index, items.length - 1 - index);
		items[items.length - 1] = null;
		return removed;
	}

	@Override
	public boolean remove(MenuItem item) {
		return remove(item.getName());
	}

	@Override
	public int removeAll(String itemName) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (items[i].getName().equals(itemName)) {
				items[i] = null;
				count++;
			}
		}
		MenuItem[] newItems = new MenuItem[items.length];
		int index = 0;
		for (MenuItem item : items) {
			if (item != null) {
				newItems[index] = item;
				index++;
			}
		}
		items = newItems;
		return count;
	}

	@Override
	public int removeAll(MenuItem item) {
		return removeAll(item.getName());
	}

	@Override
	public MenuItem[] sortedItemsByCostDesc() {
		Arrays.sort(items, (el1, el2) -> {
			double c = el2.getCost() - el1.getCost();
			return (c == 0) ? 0 : (int) c;
		});
		return items;
	}

	@Override
	public int costTotal() {
		return Arrays.stream(getItems())
				.mapToInt(MenuItem::getCost)
				.sum();
	}

	@Override
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
