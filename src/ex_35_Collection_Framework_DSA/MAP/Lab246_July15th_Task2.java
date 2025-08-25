package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab246_July15th_Task2 {
    public static void main(String[] args) {
        //Iterate Over HashMap in Three Ways
        Map<String,String> m1 = new HashMap<>();
        m1.put("Name","Dipak");
        m1.put("Role","Tester");
        m1.put("Level","Senior");
        //Keyset
        System.out.println("KEYSET");
        for(String keyset:m1.keySet())
        {
            System.out.println(keyset + "->" + m1.get(keyset));
        }
        //Entryset
        System.out.println("ENTRYSET");
        for(Map.Entry<String,String> entryset:m1.entrySet())
        {
            System.out.println(entryset.getKey() + "->" + entryset.getValue());
        }
        //Iterator
        System.out.println("ITERATOR");
        Iterator<Map.Entry<String,String>> iterator = m1.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,String> output = iterator.next();
            System.out.println(output.getKey() + "->" + output.getValue());
        }
    }
}
