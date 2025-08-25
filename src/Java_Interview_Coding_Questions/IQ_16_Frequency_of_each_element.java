package Java_Interview_Coding_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IQ_16_Frequency_of_each_element {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 15, 20, 10, 35, 30, 15, 20, 10, 45, 50};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : numbers) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }
        System.out.println(frequency);
//        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
//            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
//        }

    }
}
