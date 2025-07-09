package ex_28_Abstraction;

public class Lab190_AbstractEx {
    public static void main(String[] args) {
        Car c = new Car(); // can create an obj for a complete class but not for a abstract class
        //Father f = new Father();
        Child child = new Child();
        Father f = new Child();
        child.loan1();
        child.loan2();
    }
}
class Car {
    //complete/concrete class - not abstract class
    void concrete()
    {

    }
}
abstract class Father{
// this is abstract class which is incomplete
    //if any one func is abstract the whole class will be changed to abstract
    abstract void loan1(); // abstract function
    void loan2() // complete function  -  An abstract class can have both abstract and complete function
    {
        System.out.println("Loan2 completed");
    }
}
class Child extends Father
{
    @Override
    void loan1() {
        System.out.println("Loan1 completed");
    }
    //Father class should either be complete / create Child class as abstract class
}