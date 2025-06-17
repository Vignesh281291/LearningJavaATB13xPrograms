package ex_10_If_Condition;

import java.util.Scanner;

public class Lab071_If {
    public static void main(String[] args) {
        System.out.println("Enter Age:");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age >=18)
        {
            System.out.println("Can Vote");
        }

    }
}
