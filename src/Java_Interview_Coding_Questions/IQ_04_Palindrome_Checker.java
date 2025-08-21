package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_04_Palindrome_Checker {
    public static void main(String[] args) {

        //Palindrome without Reverse function
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String input = s.next();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) { //i=3;i>=0;i=2
            reverse = reverse + input.charAt(i);
        }
        if(input.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

        //Palindrome using Reverse function with String Builder
//        String inputnew = "Madam";
//        //inputnew = inputnew.toLowerCase();
//        StringBuilder sb = new StringBuilder(inputnew);
//        String reversenew = sb.reverse().toString();
//        System.out.println(reversenew);
//        if(reversenew.equalsIgnoreCase(inputnew))
//            System.out.println("Palindrome");
//        else
//        {
//            System.out.println("Not a palindrome");
//        }

    }