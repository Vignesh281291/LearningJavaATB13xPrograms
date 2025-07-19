package ex_34_Exceptions;

public class Lab252_July9th_Task1 {
    public static void main(String[] args) {
        //Basic Try-Catch with ArithmeticException
        int a = 10;
        int b= 0;
        try{
            int c = a/b;
        } catch(ArithmeticException e){
            System.out.println("Cannot be 0");
        }
    }
}
