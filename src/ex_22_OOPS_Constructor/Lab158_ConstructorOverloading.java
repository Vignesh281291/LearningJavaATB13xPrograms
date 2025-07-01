package ex_22_OOPS_Constructor;

public class Lab158_ConstructorOverloading {
    public static void main(String[] args) {
        PersonA p1 = new PersonA("Vignesh", 33, 100);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.salary);
        PersonA p2 = new PersonA("Vicky", "SE", 28);
        System.out.println(p2.name);
        System.out.println(p2.occupation);
        System.out.println(p2.dob);
        PersonA p3 = new PersonA();
        System.out.println(p3.name);
        p3.module = "Test2 Module";
        System.out.println(p3.module);
        System.out.println(p3.join_date);
        p1.eat();
        p2.eat();
        p3.eat();
    }
}
class PersonA
{
    String name;
    int age;
    int salary;
    String occupation;
    int dob;
    String module;
    int join_date;
    //Constructor with parameter
    PersonA(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //Constructor with parameters - Constructor Overloading
    PersonA(String name, String occupation, int dob)
    {
        this.occupation = occupation;
        this.dob = dob;
        this.name = name;
    }

    //Default Constructor
    PersonA()
    {
        module = "Test1 Module";
        join_date = 30;
        name = "Vignesh S";
    }
    void eat()
    {
        System.out.println(name + " is eating");
    }
}
