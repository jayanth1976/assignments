package javaAssignments.Assignment10;

public class Main {
    public static void main(String[] args) {
        SList<Integer> slist = new SList<>();
        slist.head = new Link<>(1);
        slist.head.setNext(new Link<>(2));
        slist.head.getNext().setNext(new Link<>(3));

// Print the initial list
        System.out.println(slist);  // Output: "1->2->3"

// Create an iterator and add an element
        SListIterator<Integer> it = slist.iterator();
        it.insert(4);
        System.out.println(slist);  // Output: "1->2->4->3"

// Remove an element
        it.remove();
        System.out.println(slist);  // Output: "1->2->3"
    }
}
