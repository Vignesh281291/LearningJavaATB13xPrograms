package ex_31_IIB;

public class Lab199_IIB_Ex2 {
    public static void main(String[] args) {
      new IIB2();
      new IIB2();
    }
}
class IIB2{
    IIB2(){
        System.out.println("Constructor");
    }
    {
        System.out.println("First IIB");
    }
    {
        System.out.println("Second IIB");
    }
    {
        System.out.println("Third IIB");
    }
    static{
        System.out.println("Static block");
    }
}