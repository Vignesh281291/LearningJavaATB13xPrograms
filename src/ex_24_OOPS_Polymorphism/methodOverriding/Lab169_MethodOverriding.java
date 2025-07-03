package ex_24_OOPS_Polymorphism.methodOverriding;

public class Lab169_MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
class Animal
{
    void sound()
    {
        System.out.println("Default Animal Sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Bow Bow");
    }
}