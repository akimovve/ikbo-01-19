package ru.mirea.lab16.models.orders;

import ru.mirea.lab16.interfaces.Orderable;
import ru.mirea.lab16.interfaces.OrdersManager;
import ru.mirea.lab16.models.MenuItem;
import ru.mirea.lab16.models.QueueNode;

import java.util.Arrays;

public class InternetOrdersManager implements OrdersManager {
	private QueueNode head;
	private QueueNode tail;
	private int size;

	@Override
	public int itemsQuantity(String itemName) {
		int count = 0;
		QueueNode queueNode = tail;
		do {
			count += queueNode.getValue().itemQuantity(itemName);
			queueNode = queueNode.getNext();
		} while (queueNode != tail);
		return count;
	}

	@Override
	public int itemsQuantity(MenuItem item) {
		return itemsQuantity(item.getName());
	}

	@Override
	public Orderable[] getOrders() {
		Orderable[] orders = new Orderable[size];
		int index = 0;
		QueueNode queueNode = tail;
		do {
			orders[index] = queueNode.getValue();
			index++;
			queueNode = queueNode.getNext();
		} while (!queueNode.equals(tail));
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
		return size;
	}

	public boolean add(Orderable order) {
		try {
			if (head == null) {
				head = new QueueNode();
				tail = new QueueNode();
				head.setValue(order);
				head.setNext(tail);
				tail.setNext(head);
			} else {
				QueueNode node = new QueueNode();
				node.setValue(order);
				node.setNext(tail);
				head.setNext(node);
			}
			size++;
		} catch (Exception e) {
			System.out.println("Error adding element (internet order manager): " + e.getMessage());
			return false;
		}
		return true;
	}

	public boolean remove(Orderable order) {
		QueueNode node = tail;
		do {
			if (node.getValue().equals(order)) {
				node.setPrev(node.getNext());
				size--;
				return true;
			}
			node = node.getNext();
		} while (node != tail);
		return false;
	}
}
