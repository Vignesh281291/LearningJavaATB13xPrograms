package ex_34_Exceptions;

public class Lab253_July9th_Task2 {
    public static void main(String[] args) {
        int[] a = {10};
//        int b =0;
//        try {
//            int c = a[2] / b;
//        }
        try {
            int output = a[1]/0;
        }
        catch (ArithmeticException e)
        {
          System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
