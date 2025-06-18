package ex_10_If_Else_Condition;

import java.util.Scanner;

public class Lab103_Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter character:");
        char c = s.next().toLowerCase().charAt(0); //charAt()->returns the character at the specified index in the string
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            System.out.println("This is a vowel");
        }
        else if(c>='a' && c<='z')
        {
            System.out.println("This is a consonant");
        }
        else
        {
            System.out.println("The entered value is not a character");
        }
    }
}
