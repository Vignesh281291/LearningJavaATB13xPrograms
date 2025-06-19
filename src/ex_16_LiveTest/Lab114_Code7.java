package ex_16_LiveTest;

import java.util.Scanner;

public class Lab114_Code7 {
    public static void main(String[] args) {
        //largest of three numbers
        //int a=8,b=7,c=61;
        Scanner s= new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        Scanner s2= new Scanner(System.in);
        System.out.println("Enter Num1:");
        int a= s.nextInt();
        System.out.println("Enter Num2:");
        int b= s1.nextInt();
        System.out.println("Enter Num3:");
        int c= s2.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a +" A is greater");
        } else if(b>a && b>c)
        {
            System.out.println(b +" B is greater");
        }
        else
        {
            System.out.println(c +" C is greater");
        }
    }
}
