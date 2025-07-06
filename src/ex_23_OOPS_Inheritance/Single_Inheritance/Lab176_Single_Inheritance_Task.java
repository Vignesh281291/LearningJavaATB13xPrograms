package ex_23_OOPS_Inheritance.Single_Inheritance;

public class Lab176_Single_Inheritance_Task {
    public static void main(String[] args) {
        cat c = new cat();
        System.out.println("Object for a inherited class can be used to call both the Parent's and Child classes");
        c.makeSound();
        c.meow();
    }

}
class Animal
{
    public void makeSound()
    {
        System.out.println("Animals make sound");
    }
}
class cat extends Animal
{
    public void meow()
    {
        System.out.println("Cat meow's");
    }
}
