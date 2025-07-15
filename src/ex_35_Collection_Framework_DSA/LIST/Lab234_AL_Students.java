package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;

public class Lab234_AL_Students {
    public static void main(String[] args) {
        Students stud1 = new Students("Test1", "Test123");
        Students stud2 = new Students("Test2", "Test146");
        Students stud3 = new Students("Test3", "Test789");

        ArrayList<Students> studAL = new ArrayList<>();
        studAL.add(stud1);
        studAL.add(stud2);
        studAL.add(stud3);
        System.out.println(studAL);
        System.out.println(studAL.get(1));
        stud2.printDetails();
    }
}
class Students{
    public Students(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    private String name;
    private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    void printDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNo: " + rollNo);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNo='" +rollNo+ '\'' + '}';
    }
}
