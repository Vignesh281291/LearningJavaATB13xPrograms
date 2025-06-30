package ex_19_Arrays;

import java.util.Scanner;

public class Lab150_2DArrays_Mul_Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(i*j +" | ");
            }
            System.out.println();
        }
    }
}
