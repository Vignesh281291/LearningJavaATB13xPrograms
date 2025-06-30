package ex_19_Arrays;

public class Lab149_Arrays_FindElement_LinearSearch {
    public static void main(String[] args) {
        int[] num = {12, 34, 10, 1, 100, 3, 4, 32};
        int target = 100;
        for (int i = 0; i < num.length; i++) {
            if(target==num[i])
            {
                System.out.println("Index of the target in the list is " + i);
            }

        }
    }
}
