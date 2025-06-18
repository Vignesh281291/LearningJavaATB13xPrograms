package ex_13_While_Loop;

public class Lab098_Whileloop_Fail {
    public static void main(String[] args) {
        int i=0;
        while(i>0) //condition fails->will not go to loop to execute
        {
            System.out.println("Execute");
            System.out.println(i);
            i++;
        }
    }
}
