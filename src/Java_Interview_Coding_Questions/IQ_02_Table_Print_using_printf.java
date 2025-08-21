package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_02_Table_Print_using_printf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n"+n+"x"+i+"="+ n*i);
        }
    }
}
