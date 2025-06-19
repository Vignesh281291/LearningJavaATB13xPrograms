package ex_16_LiveTest;

import java.util.Scanner;

public class Lab113_Code6 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Num:");
        int a= s.nextInt();
        if (a > 0) {
            System.out.println("positive");
        }
            else if(a<0)
            {
                System.out.println("negative");
            }
            else
        {
            System.out.println("zero");
        }

        }
    }

