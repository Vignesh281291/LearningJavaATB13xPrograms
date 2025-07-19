package ex_27_Super_Keyword;

public class Lab266_4thJuly_Task5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.showDetails();
        testDefault t = new testDefault();
        t.showTest();
    }
}
class Student
{
    void showDetails()
    {
        System.out.println("No access modifiers");
    }
}
class testDefault
{
void showTest()
{
    System.out.println("Test default");
}
}