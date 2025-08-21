package Java_Interview_Coding_Questions;

import java.util.Arrays;

public class IQ_15_Anagrams {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //System.out.println(str1);

        if(str1.length()!=str2.length())
        {
            System.out.println("Not a Anagram");
            return;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not a Anagrams");
        }
    }
}
