package ex_35_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab230_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(15);
        v.add(20);
        v.add(25);
        v.add(30);
        System.out.println(v);
        System.out.println("----List Iterator----");
        ListIterator li = v.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("----List Iterator(R)----");
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
        System.out.println("----Iterator----");
        Iterator i = v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
