package ex_10_If_Else_Condition;

import java.util.Scanner;

public class Lab072_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter Age:");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age >=18)
        {
            System.out.println("Can Vote");
        }
        else
        {
            System.out.println("Can't Vote");
        }
    }
}
