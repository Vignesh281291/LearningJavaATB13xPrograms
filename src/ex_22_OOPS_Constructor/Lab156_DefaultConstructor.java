package ex_22_OOPS_Constructor;

public class Lab156_DefaultConstructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        System.out.println(b1.name);
        System.out.println(b2.age);
        Parent p1 = new Parent();
        //System.out.println(p1.Pname);
        p1.Pname = "Priya";
        System.out.println(p1.Pname);
        System.out.println(b1.gender);
    }
}
class Baby{
    String name;
    int age;
    char gender;
    //Default Contructor - does not have any parameters passed
    Baby()
    {
        name = "Vihaana";
        age = 3;
        gender = 'F';
    }

}
class Parent{
    String Pname;
    int age;
    //Default Contructor - does not have any parameters passed
    Parent()
    {
        Pname = "Vignesh";
        age = 33;
    }
}
