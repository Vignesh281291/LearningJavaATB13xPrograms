package ex_28_Abstraction;

public class Lab272_7thJuly_Task4 {
    public static void main(String[] args) {
        Children child = new Children();
        child.display();
        child.show();
    }
}
abstract class Parent
{
abstract void show();
void display()
{
    System.out.println("Concrete method in abstract class");
}
}
class Children extends Parent
{
    void show()
    {
        System.out.println("Abstract method implemented");
    }
}