package ex_23_OOPS_Inheritance.Single_Inheritance;

public class Lab159_Single_Inheritance {
    public static void main(String[] args) {
    B o1=new B();
    o1.func1();
    A o2 = new A();
    // o2.func2(); Cannot call func2
    o1.func2();
    }
}
    class A
    {
        int a = 300;
        void func1()
        {
            String s = "abc";
            int i = 35;
            System.out.println("Parent:" + s + i + a);
        }
    }
    class B extends A
    {
        int b=500;
        void func2()
        {
            System.out.println("child:" + b);
            }
        }
