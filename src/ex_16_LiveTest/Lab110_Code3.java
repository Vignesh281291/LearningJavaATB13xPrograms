package ex_16_LiveTest;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab110_Code3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Num1:");
        int num1 = s.nextInt();
        System.out.println("Enter Num2:");
        int num2 = s.nextInt();
        boolean b1 = true, b2 = false;
//comparison operators
        System.out.println("equal..." + (num1 == num2));
        System.out.println("Not equal..." + (num1 != num2));
        System.out.println("Less than.." + (num1 < num2));
        System.out.println("Greater than" +(num1>num2));
        System.out.println("Less than or equal to.." + (num1 <= num2));
        System.out.println("Greater than or equal to" +(num1>=num2));
        //logical operators
        System.out.println("Logical AND..." + (b1 && b2));
        System.out.println("Logical OR ..." +(b1 || b2));
        System.out.println("NOT..." + (!b1));
        System.out.println("NOT ..." + (!b2));





    }

    }
