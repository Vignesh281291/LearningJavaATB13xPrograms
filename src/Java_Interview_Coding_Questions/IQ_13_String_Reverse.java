package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_13_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.next();
        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        System.out.println("Reverse of the given String is: " + reverse);
    }
}
