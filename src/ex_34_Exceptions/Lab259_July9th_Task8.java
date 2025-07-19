package ex_34_Exceptions;

public class Lab259_July9th_Task8 {
    public static void main(String[] args) {
        //Manual throw
        try {
            //int a = 10/0;
            throw new ArithmeticException ("Throwing error");
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
