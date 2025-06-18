package ex_12_While_Loop;

public class Lab101_Whileloop4 {
    public static void main(String[] args) {
        int i=0;
        while(i<0) //condition fails -> loop will not execute
        {
            System.out.println(i);
            i++;
        }
    }
}
