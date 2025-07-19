package ex_27_Super_Keyword;

import org.w3c.dom.ls.LSOutput;

public class Lab262_4thJuly_Task1 {
    public static void main(String[] args)
    {
        Child c = new Child();
    }
}
class Parent {
    Parent()
        {
            System.out.println("Parent class function");
        }
    }
class Child extends Parent
{
    Child()
    {
        super();
    }
}

