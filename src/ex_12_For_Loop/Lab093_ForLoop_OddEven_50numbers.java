package ex_12_For_Loop;

public class Lab093_ForLoop_OddEven_50numbers {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
                System.out.println("Even numbers are:" +i);
            else
            {
                System.out.println("Odd numbers are:" +i);
            }
        }
    }
}
