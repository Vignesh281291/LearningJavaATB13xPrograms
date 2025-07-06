package ex_22_OOPS_Constructor;

public class LAb175_Parameterized_Constructor_Task {
    public static void main(String[] args) {
        System.out.println("Calling parameterized constructor");
        parameterized_constructor pc = new parameterized_constructor(30, 40);
        System.out.println(pc.a);
        System.out.println(pc.b);
    }
}
class parameterized_constructor
{
    int a = 10;
    int b = 20;

    parameterized_constructor(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}