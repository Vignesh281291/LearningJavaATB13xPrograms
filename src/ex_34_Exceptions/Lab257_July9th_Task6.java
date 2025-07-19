package ex_34_Exceptions;

public class Lab257_July9th_Task6 {
    public static void main(String[] args) {
        String name = null;
        try
        {
            int len = name.length();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        try
        {
            int len = name.length();
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
