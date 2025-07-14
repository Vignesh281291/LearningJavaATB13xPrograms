package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab231_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("Banana");
        System.out.println(fruits1);

        List vegetables1 = new ArrayList();
        vegetables1.add("Tomato");
        vegetables1.add("Potato");
        vegetables1.add("Brinjal");
        System.out.println(vegetables1);

        List allitems = new ArrayList();
        allitems.add(fruits1);
        allitems.add(vegetables1);
        System.out.println(allitems);
        System.out.println(allitems.get(1));
    }
}
