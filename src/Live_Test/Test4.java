package Live_Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = s.nextInt();
        if(a%3==0&&a%5==0)
        {
            System.out.println("Fizzbuzz");
        } else if (a%5==0&&a%3!=0) {
            System.out.println("Buzz");
        } else if (a%3==0&&a%5!=0) {
            System.out.println("Fizz");
        }
    }
}
