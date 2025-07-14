package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab223_AL_LL_Task1 {
    public static void main(String[] args) {
        List StudentNames = new ArrayList();
        StudentNames.add("Dipak");
        StudentNames.add("Ravi");
        StudentNames.add("Sneha");
        StudentNames.add("Priya");
        StudentNames.add("Anjali");
        System.out.println("Print the Student names using Loop");
        for (int i = 0; i < StudentNames.size(); i++) {
            System.out.println(StudentNames.get(i));
        }
    }
}
