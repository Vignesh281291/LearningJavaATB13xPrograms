package ex_29_Interface;

public class Lab193_Interface_Abstraction {
    public static void main(String[] args) {
        Square s = new Square();
        s.function1(2,3);
        s.complete();
        Rectangle r = new Rectangle();
        r.function1(4,5);
    }
}
class Square implements Polygon { // Interface uses implements keyword
    @Override // completing the function1 which is incomplete method
    public void function1(int a,int b) {
        System.out.println("Overrides function1 which is in interface" + 3.14*a*b);
    }

}
class Rectangle implements Polygon{
    @Override
    public void function1(int l, int b) {
        System.out.println("Override function1 in Rectangle class" + l*b);
    }
}
interface Polygon{
    void function1(int a,int b); //incomplete method - by default interface class will have only abstract methods

    //void complete()
    //{
        //Cannot have complete/concrete method
    //}
    default void complete() //with default keyword complete function is possible in interface
    {
        System.out.println("This is possible");
    }
    static void complete1() // static method (complete method) is possible in interface
    {
        System.out.println("This is also possible");
    }
}
abstract class abs
{
    abstract void function2(); //incomplete function
    void complete()
    {
        System.out.println("Complete function in abstract class");
    }
}
