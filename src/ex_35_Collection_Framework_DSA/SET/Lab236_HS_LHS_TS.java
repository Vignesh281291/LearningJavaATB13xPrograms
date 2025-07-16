package ex_35_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab236_HS_LHS_TS {
    public static void main(String[] args) {
        //No order
        //no duplicates
        //will store in a unique hash code
        System.out.println("------HashSet------");
        Set<String> hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);
        for (String Hashset : hs) {
            System.out.println(Hashset);
        }
        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("------LinkedHashSet------");
        //order maintained - user entered order
        //no duplicates
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Banana");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
        System.out.println(lhs.contains("Banana"));
        for (Object linkedHS : lhs) {
            System.out.println(linkedHS);
        }
        System.out.println("------TreeSet------");
        //Natural sorting - so all the data should be of same data types
        //no duplicates
        //no null allowed
        Set ts = new TreeSet();
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Kiwi");
        ts.add("Banana");
        //ts.add(null);
        //ts.add(12340);
        System.out.println(ts);
        for(Object TS:ts)
        {
            System.out.println(TS);
        }
    }
}
