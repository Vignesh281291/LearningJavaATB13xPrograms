package ex_19_Arrays;

import java.util.Arrays;

public class Lab139_Array_sortandprint {
    public static void main(String[] args) {
        int[] marks = {15,5,10,2}; // length -> 4 Index -> 3
        //printing the values using loop
        //sorting using function
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
