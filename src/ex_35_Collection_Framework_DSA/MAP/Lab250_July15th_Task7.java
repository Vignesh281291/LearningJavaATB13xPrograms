package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab250_July15th_Task7 {
    public static void main(String[] args) {
        //Filter Students by Name Starting with 'A'
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Anjali");
        map.put(102,"Dipak");
        map.put(103,"Aman");
        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            if(entry.getValue().startsWith("A"))
            {
                System.out.println(entry.getKey()+"->" +entry.getValue());
            }
        }
    }
}
