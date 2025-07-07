package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab180_Method_Overloading_Task2 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printData(5);
        p.printData("Test");
        p.printData(10.54f);
    }
}
class Printer {
    void printData(int a) {
        System.out.println(a);
    }

    void printData(String a) {
        System.out.println(a);
    }

    void printData(float a)
    {
        System.out.println(a);
    }
}
