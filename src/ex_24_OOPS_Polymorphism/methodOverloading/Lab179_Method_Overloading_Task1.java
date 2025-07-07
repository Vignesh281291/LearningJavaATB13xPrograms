package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab179_Method_Overloading_Task1 {
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        c.add(5,6);
        c.add(2.5,1.5);
    }
}
class Calculator
{

    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(double a, double b)
    {
        System.out.println(a+b);
    }
}
