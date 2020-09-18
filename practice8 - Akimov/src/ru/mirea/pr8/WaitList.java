package ru.mirea.pr8;

import java.util.Collection;

/**
 * @param <E> - generics type for list
 */
public interface WaitList<E> {
    /**
     * @param element to add
     */
    void add(E element);

    /**
     * @return removed element
     */
    E remove();

    /**
     * @param element to check if it contains
     * @return true if contains
     */
    boolean contains(E element);

    /**
     * @param contentCheck - to check if list contains in custom list
     * @return true if list contains
     */
    boolean containsAll(Collection<E> contentCheck);

    /**
     * @return true if list is empty
     */
    boolean isEmpty();
}
