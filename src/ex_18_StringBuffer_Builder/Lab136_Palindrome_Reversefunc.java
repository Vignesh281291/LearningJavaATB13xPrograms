package ex_18_StringBuffer_Builder;

import java.util.Scanner;

public class Lab136_Palindrome_Reversefunc {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = s1.next();
        String reverse_string = palindrome(input);
        //System.out.println(reverse_string);
        if (reverse_string.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    static String palindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
