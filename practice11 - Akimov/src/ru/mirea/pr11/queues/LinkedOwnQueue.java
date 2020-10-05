package ru.mirea.pr11.queues;

import java.util.LinkedList;

public class LinkedOwnQueue<T> extends AbstractOwnQueue<T> {
	public LinkedOwnQueue() {
		this.queue = new LinkedList<>();
	}

	@Override
	public T poll() {
		if (queue == null)
			return null;
		T element = queue.get(0);
		queue.remove(0);
		return element;
	}

	@Override
	public T peek() {
		return queue == null ? null : queue.get(0);
	}

	@Override
	public boolean offer(T element) {
		return queue.add(element);
	}

	@Override
	public int size() {
		return queue.size();
	}
}
