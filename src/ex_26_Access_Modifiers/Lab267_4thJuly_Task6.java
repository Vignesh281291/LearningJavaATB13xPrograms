package ex_26_Access_Modifiers;

public class Lab267_4thJuly_Task6 {
    public static void main(String[] args) {
Dog d = new Dog();
d.doEat();
    }
}
class Animal
{
    protected void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void doEat()
    {
        eat();
    }
}