package ex_16_LiveTest;

import java.util.Scanner;

public class Lab118_Code11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Num:");
        int num= sc.nextInt();
        System.out.println("Numbers are...");
        for(int i=0;i<=num;i++)
        {

            System.out.print(i);
        }
    }
}
