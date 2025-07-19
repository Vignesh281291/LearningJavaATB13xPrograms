package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab251_July15th_Task8 {
    public static void main(String[] args) {
        //Find Most Frequent Character in String
        String input = "aaaabbbcc";
        Map<Character,Integer> map = new HashMap<>();
        for(char c:input.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max = 0;
        char freqChar = ' ';
        for(Map.Entry<Character,Integer> entryset : map.entrySet()) {
            if (entryset.getValue() > max) {
                max = entryset.getValue();
                freqChar = entryset.getKey();
            }
        }
            System.out.println("Most Frequently used character is :" + freqChar + "->" + max + " times");
        }
    }
