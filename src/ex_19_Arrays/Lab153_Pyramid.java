package ex_19_Arrays;

import java.util.Scanner;

public class Lab153_Pyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                    System.out.print(" ");
                }
            int pyramid = 2*i-1;
            for (int k = 1; k <=pyramid; k++) {
                System.out.print("*");
            }
            System.out.println();
            }

        }
    }
