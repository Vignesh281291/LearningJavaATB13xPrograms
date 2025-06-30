package ex_19_Arrays;

import java.util.Arrays;

public class Lab148_Arrays_SecHighestNum {
    public static void main(String[] args) {
        int[] num = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(num);
        //print in sort order
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("Second Largest number is " + num[num.length-2]);
    }
}
