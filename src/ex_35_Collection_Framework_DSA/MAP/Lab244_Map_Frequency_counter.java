package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab244_Map_Frequency_counter {
    public static void main(String[] args) {
        String value = "vihaana";
        Map<Character, Integer> freq = new HashMap();

        for(char c: value.toCharArray())
        {
            //get the first char and get default value
            //v,i,h,a,a,n,a
            //v = 1
            //i = 1
            //h = 1
            //a = 1 + 1
            //a = 2 + 1
            //n = 1
            //a = 3
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }
}
