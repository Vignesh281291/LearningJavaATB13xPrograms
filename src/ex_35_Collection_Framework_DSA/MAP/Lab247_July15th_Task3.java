package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab247_July15th_Task3 {
    public static void main(String[] args) {
        //Sort Map by Keys Using TreeMap
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Ravi",80);
        map1.put("Anjali",95);
        map1.put("Dipak",75);
        for(String s:map1.keySet())
        {
            System.out.println(s+"="+map1.get(s));
        }
        System.out.println("TREESET");
        Map<String,Integer> map2 = new TreeMap<>();
        map2.put("Ravi",80);
        map2.put("Anjali",95);
        map2.put("Dipak",75);
        for(String s:map2.keySet())
        {
            System.out.println(s+"="+map2.get(s));
        }
    }
}
