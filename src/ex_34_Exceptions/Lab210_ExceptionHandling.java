package ex_34_Exceptions;

public class Lab210_ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; //Arithmetic Exception
        try {
            b = a/b;
        } catch (Exception e) {
            System.out.println("Divide by 0 error");
        }
        System.out.println(b); //this step will also run even if there is error in the previous step,
        // because the exception is handled
    }
}
