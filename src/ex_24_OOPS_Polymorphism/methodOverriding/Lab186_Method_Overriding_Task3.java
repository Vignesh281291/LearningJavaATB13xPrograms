package ex_24_OOPS_Polymorphism.methodOverriding;

public class Lab186_Method_Overriding_Task3 {
    public static void main(String[] args) {
Employee e = new Employee();
e.role();
Manager m = new Manager();
m.role();
Clerk c = new Clerk();
c.role();
Tester t = new Tester();
t.role();
    }
}
class Employee
{
    void role()
    {
        System.out.println("I'm a General Employee");
    }
}
class Manager extends Employee
{
    void role()
    {
        System.out.println("I'm a Manager");
    }
}
class Clerk extends  Employee
{
    void role()
    {
        System.out.println("I'm a Clerk");
    }
}
class Tester extends Employee
{
    void role()
    {
        System.out.println("I'm a Tester");
    }
}