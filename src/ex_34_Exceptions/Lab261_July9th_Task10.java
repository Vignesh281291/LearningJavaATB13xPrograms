package ex_34_Exceptions;

public class Lab261_July9th_Task10 {
    public static void main(String[] args) {
        try{
            int a = 10/2;
            System.out.println(a);
            int b = 20/0;
            System.out.println(b);
            String name = "Vihaana";
            System.out.println(name.length());
            System.out.println(a);
            System.out.println(b);
            System.out.println(name);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0");
        }
    }
}
