package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab232_Collections_IQ {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(25);
        l.add(14);
        l.add(35);
        l.add(10);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }
}
