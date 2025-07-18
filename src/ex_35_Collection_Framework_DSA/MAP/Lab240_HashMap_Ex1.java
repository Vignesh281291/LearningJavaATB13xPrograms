package ex_35_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab240_HashMap_Ex1 {
    public static void main(String[] args) {
        Map hm = new HashMap(10);
        //key and value pair
        //name is key , Vicky is value
        hm.put("name","Vicky");
        hm.put("phone","8508997953");
        hm.put("age","33");
        //key order is not maintained in HashMap
        System.out.println(hm);

        Map lhm = new LinkedHashMap();
        //key and value pair
        //name is key , Vicky is value
        lhm.put("name","Vicky");
        lhm.put("phone","8508997953");
        lhm.put("age","33");
        //key order is maintained in LinkedHashMap
        System.out.println(lhm);

        Map tm = new TreeMap();
        //key and value pair
        //name is key , Vicky is value
        tm.put("name","Vicky");
        tm.put("phone","8508997953");
        tm.put("age","33");
        //natural sorting in keyMap
        System.out.println(tm);
    }
}
