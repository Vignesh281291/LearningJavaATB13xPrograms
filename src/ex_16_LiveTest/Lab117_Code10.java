package ex_16_LiveTest;

import java.util.Scanner;

public class Lab117_Code10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Num1:");
        int a= sc.nextInt();
        System.out.println("Enter Num2:");
        int b= sc.nextInt();
        System.out.println("enter the operator...");
         char ch= sc.next().charAt(0);
         switch(ch)
         {
             case '+':
                 System.out.println("addition......" + (a+b));
                 break;
             case '-':
                 System.out.println("Subtraction......" + (a-b));
                 break;
             case '*':
                 System.out.println("Multiplication......" + (a*b));
                 break;
             case '/':
                 System.out.println("Division......" + (a/b));
                 break;
         }


    }
}
