package ex_12_While_Loop;

import java.util.Scanner;

public class Lab102_Whileloop_Factorial_IQ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to see the Factorial of it:");
        if(!s.hasNextInt())
        {
            System.out.println("Please enter a number");
            return;
        }
        int n = s.nextInt();
        long fact = 1l;
        if(n<0)
        {
            System.out.println("Number can't be negative to calculate Factorial");
            return;
        }
        if(n==0)
        {
            System.out.println(fact);
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                fact = fact * i;
            }
        }
        System.out.println("Factorial is:" + fact);

    }
}