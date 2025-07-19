package ex_27_Super_Keyword;

import org.w3c.dom.ls.LSOutput;

public class Lab264_4thJuly_Task3 {
    public static void main(String[] args) {
A2 a = new A2();
a.display();
    }
}
class A1
{
    int a = 10;
}
class A2 extends A1
{
    int a = 20;

    void display()
    {
        System.out.println(super.a);
        System.out.println(a);
    }
}