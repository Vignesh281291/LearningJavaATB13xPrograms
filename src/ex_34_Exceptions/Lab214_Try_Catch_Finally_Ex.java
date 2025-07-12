package ex_34_Exceptions;

import java.util.Scanner;

public class Lab214_Try_Catch_Finally_Ex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input");
        int input = s.nextInt();
        try {
            int output = 10 / input;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
    }

    }
