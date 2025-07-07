package ex_24_OOPS_Polymorphism.methodOverriding;

public class Lab184_Method_Overriding_Task1 {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.sound();
        Dogs d = new Dogs();
        d.sound();
        Cats c = new Cats();
        c.sound();
        Cows co = new Cows();
        co.sound();
    }
}
class Animals
{
    void sound()
    {
        System.out.println("Animal sounds");
    }
}
class Dogs extends Animals
{
void sound()
{
    System.out.println("Bark");
}
}
class Cats extends Animals
{
void sound()
{
    System.out.println("Meow");
}
}
class Cows extends Animals
{
    void sound()
    {
        System.out.println("Mooo");
    }

}