package ex_12_While_Loop;

public class Lab096_Whileloop1 {
    public static void main(String[] args) {
        int i=1;
        while(i<10) //entry controlled loop
            //if the condition fails, it will not enter into the loop
        {
            System.out.println(i);
            i++;
        }
        for(int j=1;j<10;j++)
        {
            System.out.println(j);
        }
    }
}
