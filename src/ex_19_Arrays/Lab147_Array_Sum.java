package ex_19_Arrays;

public class Lab147_Array_Sum {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        int sum =0;
        for (int i = 0; i<num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
