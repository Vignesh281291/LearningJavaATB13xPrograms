package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_06_LeapYear_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int Year = sc.nextInt();
        if((Year % 4 == 0 && Year % 100 !=0) || (Year % 400 == 0))
        {
            System.out.println(Year + " is a leap year");
        }
        else
        {
            System.out.println(Year + " is not a leap year");
        }
    }
}
