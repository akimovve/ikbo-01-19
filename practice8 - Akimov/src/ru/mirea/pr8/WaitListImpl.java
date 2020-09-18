package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @param <E> - generics type for list
 * @implNote class that implements interface
 */
public class WaitListImpl<E> implements WaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitListImpl() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitListImpl(Collection<E> content) {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    @Override
    public String toString() {
        return "WaitList {" +
                "content = " + content +
                '}';
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> contentCheck) {
        return content.containsAll(contentCheck);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
