package ex_35_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab221_LL_Ex2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("test");
        list.add(45);
        list.addFirst("456");
        list.addLast("test");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("123"));
        System.out.println(list.indexOf("test"));
        System.out.println(list.lastIndexOf(45));
        System.out.println(list.get(0));
        System.out.println(list.contains("456"));
        System.out.println("Iterator in List");
        Iterator i = list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
