package ex_12_For_Loop;

public class Lab094_ForLoop_Break {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i==10)
            break; //when the condition satisfies it breaks and looping will not happen
            else
            {
                System.out.println(i);
            }
        }
    }
}
