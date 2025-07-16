package ex_35_Collection_Framework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab238_Queue_LL {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList();
        q1.add(12);
        q1.add(10);
        q1.add(55);
        System.out.println(q1);

        Iterator i = q1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
