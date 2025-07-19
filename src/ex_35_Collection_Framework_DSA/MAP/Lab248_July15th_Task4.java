package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab248_July15th_Task4 {
    public static void main(String[] args) {
        //Character Frequency Counter
        String input = "aabbccddeeff";
        Map<Character,Integer> map = new HashMap<>();
        for(char c:input.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
            //System.out.println(c);
        }
        System.out.println(map);
    }
}
