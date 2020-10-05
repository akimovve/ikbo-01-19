package ru.mirea.pr11.queues;

public interface OwnQueue<T> {
	T element();
	T poll();
	T peek();
	boolean offer(T element);
}
