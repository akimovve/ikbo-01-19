package ru.mirea.lab16.models;

public class ListNode {
	protected ListNode next;
	protected MenuItem value;

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public MenuItem getValue() {
		return value;
	}

	public void setValue(MenuItem value) {
		this.value = value;
	}
}
