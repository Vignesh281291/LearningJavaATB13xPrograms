package ex_34_Exceptions;

public class Lab213_Try_Catch_Finally {
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        try {
            int b = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
