package ex_35_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab225_AL_LL_Task3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        System.out.println("Reverse is:");
        System.out.println(ll.reversed());
    }
}
