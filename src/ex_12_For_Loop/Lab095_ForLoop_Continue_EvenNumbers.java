package ex_12_For_Loop;

public class Lab095_ForLoop_Continue_EvenNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println("Odd numbers:"+i);
        }
    }
}
