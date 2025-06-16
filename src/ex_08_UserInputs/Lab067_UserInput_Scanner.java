package ex_08_UserInputs;

import java.util.Scanner;

public class Lab067_UserInput_Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Inbuilt class
        System.out.println("Enter the Age:3");
        int age = s.nextInt();
        String CanIVote = age >= 18 ? "Can Vote" : "Cannot Vote";
        System.out.println(CanIVote);
    }
}
