package ex_08_UserInputs;

import java.util.Scanner;

public class Lab068_UserInput_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter text:");
        Scanner s = new Scanner(System.in);
        System.out.println(s.next()); // next() is for String
        System.out.println("Enter Integer:");
        System.out.println(s.nextInt()); // nextInt is for Int
        System.out.println("Enter Float:");
        System.out.println(s.nextFloat()); // nextFloat is for Float
    }
}
