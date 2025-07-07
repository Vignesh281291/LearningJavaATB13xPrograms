package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab182_Method_Overloading_Task4 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();
        g.greet("Vignesh");
    }
}
class Greeter
{
    void greet()
    {
        System.out.println("Hello");
    }
    void greet(String name)
    {
        System.out.println("Hello " + name);
    }
}