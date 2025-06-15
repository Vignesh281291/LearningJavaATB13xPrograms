package ex_09_Increment_Decrement_Operator;

public class Lab063_Increment_Decrement_Task5 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
