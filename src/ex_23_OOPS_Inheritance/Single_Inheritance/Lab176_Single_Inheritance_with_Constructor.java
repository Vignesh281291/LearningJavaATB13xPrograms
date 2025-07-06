package ex_23_OOPS_Inheritance.Single_Inheritance;

public class Lab176_Single_Inheritance_with_Constructor {
    public static void main(String[] args)
    {
        bike b = new bike();
    }
}
class vehicle
{
    vehicle()
    {
        System.out.println("Vehicle is ready");
    }
}
class bike extends vehicle
{
    bike()
    {
        System.out.println("Bike is ready");
    }
}
