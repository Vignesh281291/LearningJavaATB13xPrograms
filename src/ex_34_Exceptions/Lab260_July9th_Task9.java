package ex_34_Exceptions;

public class Lab260_July9th_Task9 {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("continue");
    }
}
