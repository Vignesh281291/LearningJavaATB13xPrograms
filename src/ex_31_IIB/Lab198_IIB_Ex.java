package ex_31_IIB;

public class Lab198_IIB_Ex { // Instance Initialization Block
    public static void main(String[] args) {
        IIB obj1 = new IIB();
        IIB obj2 = new IIB();
    }
}
class IIB{
    IIB() {
        System.out.println("Hi.. Constructor called");
    }
        {
            int a = 10;
            System.out.println("I'm IIB.. This will be called when an instance is created for a class");
            System.out.println(a);
        }
        static{
            System.out.println("This is Static... called only once as I'm static");
        }
    }