package ru.mirea.pr8;

/**
 * @param <E> - generics type for list
 */
public class UnfairWaitList<E> extends WaitListImpl<E> {
    public UnfairWaitList() {
        super();
    }

    /**
     * @return the removed element
     */
    @Override
    public E remove() {
        return super.remove();
    }

    /**
     * @param element - add to back
     */
    public void moveToBack(E element) {
        super.add(element);
    }
}
