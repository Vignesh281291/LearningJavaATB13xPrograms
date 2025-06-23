package ex_17_Strings;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class Lab120_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = s.next();
        //name= name.toLowerCase();
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse = reverse + name.charAt(i);
        }
        //System.out.println(reverse);
        if(name.equals(reverse))
        {
            System.out.println("Entered String is a Palindrome");
        }
        else
        {
            System.out.println("Entered String is not a Palindrome");
        }
    }
}
