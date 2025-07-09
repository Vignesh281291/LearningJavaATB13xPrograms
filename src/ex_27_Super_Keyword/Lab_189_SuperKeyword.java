package ex_27_Super_Keyword;

public class Lab_189_SuperKeyword {
    public static void main(String[] args) {
Animal a = new Animal();
a.sound();
a.Test();
a.test();
Animal b = new Animal(0,0);
God g = new God(5);
    }
}
class God
{
    public int a = 10;
    God()
    {
        System.out.println("God DC");
    }
    God(int a)
    {
        System.out.println("God PC");
    }
    God(int i, int j)
    {
        System.out.println(i+j);
    }
        void sound()
        {
            System.out.println("God sound");
        }
        void test()
        {
            System.out.println(this.a); //this keyword is used to access the members of the current class
        }
}
class Animal extends God
{
    void sound()
    {
        System.out.println("Animal sound");
        super.sound(); // Super keyword is used to access the parent class's constructor
    }
    Animal()
    {
        super();
    }
    Animal(int a, int b)
    {
        super(5,6);
    }
    void Test()
    {
        System.out.println(super.a);
    }
}

