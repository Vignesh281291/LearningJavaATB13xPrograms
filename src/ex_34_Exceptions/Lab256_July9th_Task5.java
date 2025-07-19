package ex_34_Exceptions;

public class Lab256_July9th_Task5 {
    public static void main(String[] args) {
        String name = null;
        try {
            String trim = name.trim();
        }
        catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}