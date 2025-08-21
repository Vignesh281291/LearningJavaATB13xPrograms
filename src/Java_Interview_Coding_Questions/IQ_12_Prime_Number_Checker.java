package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_12_Prime_Number_Checker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(isprime(number))
        {
            System.out.println("The number " +number+ " is a Prime Number");
        }
        else
        {
            System.out.println("The number " +number+ " is a not Prime Number");
        }

    }
    public static boolean isprime(int n)
    {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return false;
    }

}
