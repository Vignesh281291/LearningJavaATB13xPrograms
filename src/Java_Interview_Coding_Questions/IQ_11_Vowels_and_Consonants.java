package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_11_Vowels_and_Consonants {
    public static void main(String[] args) {
        int countofvowels = 0;
        int countofconsonants = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //System.out.println(c);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                countofvowels++;
            }
            else {
                countofconsonants++;
            }
        }
        System.out.println("Total no of vowels in the input string is: " + countofvowels);
        System.out.println("Total no of consonants in the input string is: " + countofconsonants);
    }
}
