package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;

public class Lab216_ArrayList_Ex {
    public static void main(String[] args) {
        ArrayList a = new ArrayList(10);
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("5");
        a.add("8");
        a.add("9");
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.contains("3"));
    }
}
