package ex_34_Exceptions;

public class Lab254_July9th_Task3 {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 5 / a;
        } catch (Exception e) {
            //throw new RuntimeException(e.getMessage());
            System.out.println(e.getMessage());
        }
        //System.out.println("Executed?");
        finally {
            System.out.println("This should be executed");
        }

    }
}
