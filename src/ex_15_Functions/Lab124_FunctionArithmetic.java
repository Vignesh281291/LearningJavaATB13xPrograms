package ex_15_Functions;

import java.util.Scanner;

public class Lab124_FunctionArithmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1 = s.nextInt();
        System.out.println("Enter Number2:");
        int num2 = s.nextInt();
        int Sum = sum(num1, num2);
        System.out.println("Sum ="+ Sum);
        int Sub = sub(num1, num2);
        System.out.println("Sub ="+ Sub);
        int Mul = mul(num1, num2);
        System.out.println("Mul ="+ Mul);
        int Div = div(num1, num2);
        System.out.println("Div ="+ Div);
    }
    //Arithmetic Operation with parameters and with return type function
    static int sum(int a, int b)
    {
        return (a+b);
    }
    static int sub(int a, int b)
    {
        return (a-b);
    }
    static int mul(int a, int b)
    {
        return (a*b);
    }
    static int div(int a, int b)
    {
        if(b==0)
        {
            System.out.println("b cannot be zero");
        }
        return (a / b);
    }
}
