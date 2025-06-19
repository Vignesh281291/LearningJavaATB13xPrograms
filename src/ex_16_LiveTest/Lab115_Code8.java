package ex_16_LiveTest;

import java.util.Scanner;

public class Lab115_Code8 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Year:");
            int Year = s.nextInt();
            if(Year<0) {
                System.out.println("Enter valid year");
            }
            else if (((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0))
            {
                System.out.println("Leap Year");
            }
            else
                System.out.println("Not a Leap Year");
        }
    }
