package ex_34_Exceptions;

public class Lab212_Exception_Handling_IQ {
    public static void main(String[] args) {
        String name = null;
        try {
            name.trim(); // vulnerable code should be in the try block
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arithmetic exception");
        }catch (Exception e) {
            System.out.println("Error again!");
        }
        System.out.println("Will I be executed?");
    }
}
