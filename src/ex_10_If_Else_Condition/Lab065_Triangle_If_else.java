package ex_10_If_Else_Condition;

import java.util.Scanner;

public class Lab065_Triangle_If_else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sides");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if (a==b && b==c)
        {
            System.out.println("All sides are equal");
        }
        else if (a==b || b==c ||a==c)
        {
            System.out.println("2 sides are equal");
        }
        else
        {
                System.out.println("No sides are equal");
        }
    }
}
