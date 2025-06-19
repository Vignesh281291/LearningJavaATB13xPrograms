package ex_16_LiveTest;

import java.util.Scanner;

public class Lab119_Code12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        if(n<0)
            System.out.println("Please enter a number greater than 0");
        else {
            long fact = 1l;
            int i = 1;
            while (i <= n) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial of the number " + n + " is " + fact);
        }
    }
}
