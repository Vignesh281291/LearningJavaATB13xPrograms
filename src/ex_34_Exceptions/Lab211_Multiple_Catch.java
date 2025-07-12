package ex_34_Exceptions;

public class Lab211_Multiple_Catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; //Arithmetic Exception
        try {
            b = a/b;
        } catch (ArithmeticException e) { //use the smaller exception class first and then the bigger class later
            System.out.println("Divide by 0 error");
        }catch (Exception e){
            System.out.println("Please correct Divide by 0 error");
        }
    }
}
