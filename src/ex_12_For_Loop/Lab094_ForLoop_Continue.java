package ex_12_For_Loop;

public class Lab094_ForLoop_Continue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if(i==10)
                continue; //skip when the value reaches 10 and move to top and loop continues to execute
            else
            {
                System.out.println(i);
            }
        }
    }
}
