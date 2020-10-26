package ru.mirea.lab16.models;

import ru.mirea.lab16.interfaces.Orderable;

public class QueueNode {
	protected QueueNode next;
	protected QueueNode prev;
	protected Orderable value;

	public QueueNode getNext() {
		return next;
	}

	public void setNext(QueueNode next) {
		this.next = next;
	}

	public QueueNode getPrev() {
		return prev;
	}

	public void setPrev(QueueNode prev) {
		this.prev = prev;
	}

	public Orderable getValue() {
		return value;
	}

	public void setValue(Orderable value) {
		this.value = value;
	}
}
