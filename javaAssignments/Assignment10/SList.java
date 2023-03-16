package javaAssignments.Assignment10;

import java.util.ArrayList;

public class SList<T> {
    public Link<T> head;

    public SList() {
        this.head = null;
    }

    public SListIterator<T> iterator() {
        return new SListIterator<>(head);
    }

    @Override
    public String toString() {
        ArrayList<String> res = new ArrayList<>();
        Link<T> curr = head;
        while (curr != null) {
            res.add(curr.getData().toString());
            curr = curr.getNext();
        }
        return String.join("->", res);
    }
}