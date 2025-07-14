package ex_35_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab220_LinkedList_Ex {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList();
        l.add("Lion");
        l.add("Tiger");
        l.add("Elephant");
        l.add("Elephant");
        l.addFirst("Big Lion");
        l.addLast("Small Elephant");
        System.out.println("Linked List: " + l);
        l.removeFirst();
        l.removeLast();
        System.out.println("Linked List: "+ l);
        System.out.println(l.size());
    }
}
