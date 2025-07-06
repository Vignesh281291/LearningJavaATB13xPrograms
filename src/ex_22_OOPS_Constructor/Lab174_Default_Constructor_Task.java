package ex_22_OOPS_Constructor;

public class Lab174_Default_Constructor_Task {
    public static void main(String[] args) {
        System.out.println("Calling the default constructor");
        default_constructor dc = new default_constructor(); //creating an object for the class
        // automatically calls the default constructor
    }
}
class default_constructor
{
    int a = 10;
    int b = 20;
    String text = "Test";
    default_constructor() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(text);
    }
}
