package ex_11_Switch;

import java.util.Scanner;

public class Lab074_Switch {
    public static void main(String[] args) {
        System.out.println("Enter the day 1 to 7:");
        Scanner s = new Scanner (System.in);
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                //break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("NA");
                break;
        }
    }
}
