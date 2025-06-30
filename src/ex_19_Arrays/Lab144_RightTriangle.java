package ex_19_Arrays;

import java.util.Scanner;

public class Lab144_RightTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++)
            {
                // (0,0)   (0,1)   (0,2)
                // (1,0)   (1,1)   (1,2)
                // (2,0)   (2,1)    (2,2)
                if (i>=j)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
            }
        }
    }
