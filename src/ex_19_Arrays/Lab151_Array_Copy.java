package ex_19_Arrays;

public class Lab151_Array_Copy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.out.println(copy[0]);
        System.arraycopy(original, 0, copy, 0, original.length);


    }
}
