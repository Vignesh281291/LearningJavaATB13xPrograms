package ex_24_OOPS_Polymorphism.methodOverriding;

public class Lab185_Method_Overriding_Task2 {
    public static void main(String[] args) {
Vehicle v = new Vehicle();
v.start();
Bike b = new Bike();
b.start();
Car c = new Car();
c.start();
    }
}
class Vehicle
{
    void start()
    {
        System.out.println("Starting Vehicle");
    }
}
class Bike extends Vehicle
{
    void start()
    {
        System.out.println("Kick start the Bike");
    }
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Turn the key to start the car");
    }
}
