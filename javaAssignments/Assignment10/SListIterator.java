package javaAssignments.Assignment10;

import java.util.NoSuchElementException;

public class SListIterator<T> {
    private Link<T> curr;

    public SListIterator(Link<T> head) {
        this.curr = head;
    }

    public boolean hasNext() {
        return curr != null;
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T val = curr.getData();
        curr = curr.getNext();
        return val;
    }

    public void insert(T data) {
        Link<T> newLink = new Link<>(data);
        newLink.setNext(curr.getNext());
        curr.setNext(newLink);
    }

    public void remove() {
        curr.setNext(curr.getNext().getNext());
    }
}
