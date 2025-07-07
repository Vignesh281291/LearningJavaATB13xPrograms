package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab181_Method_Overloading_Task3 {
    public static void main(String[] args)
    {
        MathOperations mo = new MathOperations();
        System.out.println(mo.multiply(5,5));
        System.out.println(mo.multiply(5,5,5));
    }
}
class MathOperations
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    int multiply(int a, int b, int c)
    {
        return a*b*c;
    }
}