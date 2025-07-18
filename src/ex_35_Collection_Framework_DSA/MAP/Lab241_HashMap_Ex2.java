package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab241_HashMap_Ex2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Name",123);
        map.put("age", 45);
        map.put("phone", 7890);
        map.put("address", 23);
        map.put("car1",88);
        map.put("car2", 99);
        map.put("car2",100);
        map.put("car3",100);
        map.put("car4", null);
        map.put(null, 1);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("car4"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove("car3"));
        System.out.println(map.keySet());
        System.out.println("------For Loop------");
        for(String keys : map.keySet())
        {
            System.out.println(keys + ":" +map.get(keys));
        }
        System.out.println("------Another For Loop-----");
        for(Map.Entry<String,Integer> i : map.entrySet())
        {
            System.out.println(i.getKey() + "->" + i.getValue());
        }
        if(map.containsKey("sex"))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        map.clear();
        System.out.println("Size after clearing: "+map.size());
    }
}
