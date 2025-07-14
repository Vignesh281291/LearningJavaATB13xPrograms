package ex_35_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab228_AL_LL_Task6 {
    public static void main(String[] args) {
            LinkedList list1 = new LinkedList();
            list1.add("Apple");
            list1.add("Banana");
            list1.add("Mango");
            System.out.println(list1);
            System.out.println("Insert Orange at index1");
            list1.add(1,"Orange");
            System.out.println(list1);
    }
}
