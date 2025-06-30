package ex_19_Arrays;

import java.util.Scanner;

public class Lab146_Array_Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int num = s.nextInt();
        int[] revnum = new int[num];
        System.out.println("Enter " +num+ " numbers");
        for (int i = 0; i < revnum.length; i++) {
            revnum[i] = s.nextInt();
        }
        System.out.println("Reverse of the given numbers are");
        for (int i = revnum.length-1; i >= 0; i--) {
            System.out.println(revnum[i]);
        }
    }
}
