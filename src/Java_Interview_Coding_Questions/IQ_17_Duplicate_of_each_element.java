package Java_Interview_Coding_Questions;

import java.util.HashMap;
import java.util.Map;

public class IQ_17_Duplicate_of_each_element {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 10, 40, 20, 30, 10,20,10};
        Map<Integer, Integer> freq = new HashMap();
        for (int n : numbers) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        for(int key: freq.keySet())
        {
            if(freq.get(key)>1)
            {
                System.out.println(key);
            }
        }
    }
}
