package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab217_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
        //arraylist.add("Test"); Only integers can be used in the arraylist
        arraylist.add(123);
        //arraylist.add("Test");
        //arraylist.add(true);
        System.out.println(arraylist);
        System.out.println(arraylist.size());

        List l1 = new ArrayList();
        System.out.println(l1.isEmpty());

    }
}
