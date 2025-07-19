package ex_27_Super_Keyword;

public class Lab263_4thJuly_Task2 {
    public static void main(String[] args) {
B b= new B();
b.disp();
    }
}
class A
{
    void func1()
    {
        System.out.println("A's function");
    }
}
class B extends A
{
void func1()
{
    System.out.println("B's function");
}
void disp()
{
    func1();
    super.func1();
}
}
