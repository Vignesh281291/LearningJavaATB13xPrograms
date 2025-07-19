package ex_35_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab245_July15th_Task1 {
    public static void main(String[] args) {
        //Word Frequency Counter Using HashMap
        String input = "java is easy and java is powerful";
        Map<String,Integer> wordFreq = new HashMap();
        String[] def = input.split(" ");
        //System.out.println(def[2]);
        for(String s:def)
        {
            wordFreq.put(s,wordFreq.getOrDefault(s,0)+1);
        }
        System.out.println(wordFreq);
    }
}
