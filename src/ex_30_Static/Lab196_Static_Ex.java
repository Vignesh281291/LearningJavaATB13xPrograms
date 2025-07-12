package ex_30_Static;

public class Lab196_Static_Ex {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(A.number); // object reference is not needed to access the Static variables
        //can call the variables/methods directly with the class name itself
        a1.number = 15;
        System.out.println(A.number);
        System.out.println(a1.number);
    }
}
class A{
    static int number = 20;
    int b = 30;
}