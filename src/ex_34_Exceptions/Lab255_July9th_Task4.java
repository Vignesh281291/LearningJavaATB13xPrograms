package ex_34_Exceptions;

public class Lab255_July9th_Task4 {
    public static void main(String[] args) {
        int[] a = {0};
        try
        {
            int b = 5 / a[0];
        }
        catch (Exception e)
        {
            //throw new RuntimeException(e.getMessage());
            System.out.println(e.getMessage());
            System.out.println("Divide by 0");
            try
            {
                int output = a[2];
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                System.out.println("Index out of bound");
            }
        }
    }
}
