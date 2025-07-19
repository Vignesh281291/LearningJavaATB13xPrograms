package ex_35_Collection_Framework_DSA.MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab249_July15th_Task5 {
    public static void main(String[] args) {
        //Find First Non-Repeated Character
        String input = "aabbccdeeff";
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entryset : map1.entrySet()) {
            if (entryset.getValue() == 1)
            {
                System.out.println("First Non-repeated character is: "+entryset.getKey());
                break;
            }
        }
    }
}
