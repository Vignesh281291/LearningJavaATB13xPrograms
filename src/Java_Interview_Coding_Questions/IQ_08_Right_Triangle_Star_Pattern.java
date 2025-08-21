package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_08_Right_Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        // (0,0)   (0,1)   (0,2)
        // (1,0)   (1,1)   (1,2)
        // (2,0)   (2,1)    (2,2)
        for (int i = 0; i <n; i++)
        {
            for (int j = 0; j <n; j++)
            {
                if(i>=j)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
