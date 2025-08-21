package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_05_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark: ");
        int mark = sc.nextInt();
        if(mark >= 90 && mark <= 100)
        {
            System.out.println("Grade is A");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Grade is B");
        }
        else if (mark >= 70 && mark < 80) {
            System.out.println("Grade is C");
        }
        else if (mark >= 60 && mark < 70) {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("Grade is F");
        }
    }
}
