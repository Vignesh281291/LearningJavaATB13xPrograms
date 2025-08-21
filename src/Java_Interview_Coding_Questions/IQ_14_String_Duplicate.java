package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_14_String_Duplicate {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = removeDuplicates(input);
        System.out.println(output);

    }

    public static String removeDuplicates(String str)
    {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(result.indexOf(c) == -1)
            {
                result= result + c;
            }
        }
        return result;
        }
}
