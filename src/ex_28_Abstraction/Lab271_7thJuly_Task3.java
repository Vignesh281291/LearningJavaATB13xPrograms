package ex_28_Abstraction;

public class Lab271_7thJuly_Task3 {
    public static void main(String[] args) {
        noabs n = new noabs();
        n.absMethod();
    }
}
abstract class abs
{
    abs()
    {
        System.out.println("Abstract class constructor called");
    }
    abstract void absMethod();

}
class noabs extends abs{
    @Override
    void absMethod()
    {
        System.out.println("Method from abstract class");
    }
}
