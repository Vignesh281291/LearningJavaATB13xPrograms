package ex_10_If_Else_Condition;

import java.util.Scanner;

public class Lab109_Grade_Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark=s.nextInt();
        if(mark>=90&&mark<=100)
        {
            System.out.println("Grade is A");
        } else if (mark>=80&&mark<90) {
            System.out.println("Grade is B");
        } else if (mark>=70&&mark<80) {
            System.out.println("Grade is C");
        }else if (mark>=60&&mark<70) {
            System.out.println("Grade is D");
        }else if (mark>=0&&mark<60) {
            System.out.println("Grade is F");
        }
        else
            System.out.println("Enter mark between 0 to 100");
    }
}
