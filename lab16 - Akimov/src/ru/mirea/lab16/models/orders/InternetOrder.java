package ru.mirea.lab16.models.orders;

import ru.mirea.lab16.interfaces.Orderable;
import ru.mirea.lab16.models.Customer;
import ru.mirea.lab16.models.ListNode;
import ru.mirea.lab16.models.MenuItem;

import java.util.Arrays;

public class InternetOrder implements Orderable {
	private Customer customer;
	private int size;
	private ListNode head;
	private ListNode tail;

	@Override
	public boolean add(MenuItem item) {
		try {
			if (head == null) {
				head = new ListNode();
				tail = new ListNode();
				head.setValue(item);
				head.setNext(tail);
				tail.setNext(head);
			} else {
				ListNode node = new ListNode();
				node.setValue(item);
				node.setNext(tail);
				head.setNext(node);
			}
			size++;
		} catch (Exception e) {
			System.out.println("Error adding element (internet): " + e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public String[] itemsNames() {
		String[] names = new String[size];
		ListNode node = tail;
		int index = 0;
		do {
			names[index] = node.getValue().toString();
			index++;
			node = node.getNext();
		} while (node != tail);
		return names;
	}

	@Override
	public int itemsQuantity() {
		return size;
	}

	@Override
	public int itemQuantity(String itemName) {
		int count = 0;
		ListNode node = tail;
		do {
			if (node.getValue().getName().equals(itemName))
				count++;
			node = node.getNext();
		} while (node != tail);
		return count;
	}

	@Override
	public int itemQuantity(MenuItem itemName) {
		return itemQuantity(itemName.getName());
	}

	@Override
	public MenuItem[] getItems() {
		MenuItem[] items = new MenuItem[size];
		ListNode node = tail;
		int index = 0;
		do {
			items[index] = node.getValue();
			index++;
			node = node.getNext();
		} while (node != tail);
		return items;
	}

	@Override
	public boolean remove(String itemName) {
		ListNode node = tail;
		do {
			if (node.getNext().getValue().getName().equals(itemName)) {
				node.setNext(node.getNext().getNext());
				size--;
				return true;
			}
			node = node.getNext();
		} while (node != tail);
		return false;
	}

	@Override
	public boolean remove(MenuItem item) {
		return remove(item.getName());
	}

	@Override
	public int removeAll(String itemName) {
		int count = 0;
		ListNode node = tail;
		do {
			if (node.getNext().getValue().getName().equals(itemName)) {
				node.setNext(node.getNext().getNext());
				count++;
			}
			node = node.getNext();
		} while (node != tail);
		return count;
	}

	@Override
	public int removeAll(MenuItem item) {
		return removeAll(item.getName());
	}

	@Override
	public MenuItem[] sortedItemsByCostDesc() {
		MenuItem[] items = getItems();
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
