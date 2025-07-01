package ex_22_OOPS_Constructor;

public class Lab157_ParameterizedConstructor {
    public static void main(String[] args) {
        NewBaby nb = new NewBaby("Vicky",33, 45667, 28); //Object for Parameterized constructor
        System.out.println("***Parameterized Constructor***");
        System.out.println(nb.name);
        System.out.println(nb.age);
        System.out.println(nb.aadhar);
        System.out.println(nb.date);
        NewBaby nb1 = new NewBaby(); //Object for Default constructor
        System.out.println("***Default Constructor***");
        System.out.println(nb1.name);
        System.out.println(nb1.age);
    }
}
class NewBaby{
String name;
int age;
int aadhar;
int date;

NewBaby(String namec, int agec, int aadharc, int datec)
{
    this.name = namec;
    this.age = agec;
    this.aadhar = aadharc;
    this.date = datec;
}

NewBaby()
{
name="Vihaana";
age = 3;
}
}
