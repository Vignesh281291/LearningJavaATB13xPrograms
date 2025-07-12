package ex_30_Static;

public class Lab200_Static_Ex2 {
    public static void main(String[] args) {
        B ref1 = new B(100);
        System.out.println(ref1.a);
        System.out.println(B.b);
        B ref2 = new B(200);
        System.out.println(ref2.a);
        System.out.println(ref1.b);
        System.out.println(ref2.b);
        ref1.display();
        ref2.display();
        B.staticMethod();


    }
}
class B{
    int a = 10;
    static  int b = 20;
    B(int a){
        this.a=a;
    }
    void display(){
        System.out.println("Non-Static Method"); //instance method can have static variables
    }
    static void staticMethod(){
        System.out.println("Static Method");
        // System.out.println(this.a); static method cannot access non-static variables
    }
}