package ex_28_Abstraction;

public class Lab269_7thJuly_Task1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
    }
}
abstract class Animal
{
    abstract void makeSound();
}
class Dog extends Animal
{
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal
{
    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }
}
