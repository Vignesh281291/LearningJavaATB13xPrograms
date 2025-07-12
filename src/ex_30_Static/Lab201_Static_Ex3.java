package ex_30_Static;

public class Lab201_Static_Ex3 {
    public static void main(String[] args) {
        S s = new S();
        s.nonStaticfunc();
    }
}
class S{
    static{
        System.out.println("This is Static block");
    }
    int a = 10;
    static int b = 20;
void nonStaticfunc()
{
    System.out.println(b); //Non-static method can access static variables
}
}
