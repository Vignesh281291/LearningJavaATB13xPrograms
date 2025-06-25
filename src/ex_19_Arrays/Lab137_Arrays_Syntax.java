package ex_19_Arrays;

public class Lab137_Arrays_Syntax {
    public static void main(String[] args) {
        // 1st way
        int[] marks = {10,20,30,40};
        System.out.println(marks[0]);
        System.out.println(marks.length);
        //2nd way
        String[] names = new String[5]; //size should be given
        names[0] = "Test";
        //names[6] = "No";
        System.out.println(names[0]);
    }
}
