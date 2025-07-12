package ex_30_Static;

public class Lab197_StaticMember_Ex {
    public static void main(String[] args) {
        Test a = new Test(); //class loaded when loaded static member is called only once
        System.out.println(Test.a); //access static variable with class name
    }
}
class Test
{
    static int a = 10;
    static {
        System.out.println("Static member is called whenever a class is loaded");
    }
    static{
        System.out.println("Loading excel file");
        System.out.println("Launch browser");
    }
}
