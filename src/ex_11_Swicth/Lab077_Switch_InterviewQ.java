package ex_11_Swicth;

import java.util.Scanner;

public class Lab077_Switch_InterviewQ {
    public static void main(String[] args) {
        char c = 'A';
        switch (c)
        {
            case 65:
            System.out.println("A is 65 (ASCII)");
            break;
            default:
            System.out.println("No Match");
            break;
        }
    }
}
