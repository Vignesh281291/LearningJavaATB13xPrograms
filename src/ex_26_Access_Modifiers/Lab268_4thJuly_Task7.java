package ex_26_Access_Modifiers;

public class Lab268_4thJuly_Task7 {
    public static void main(String[] args) {
Student s1 = new Student();
s1.showInfo();
    }
}
class Student
{
    void showInfo()
    {
        System.out.println("Public Access: Student Info");
    }
}
class Teacher extends Student
{
    void getStudentInfo()
    {
        showInfo();
    }
}
