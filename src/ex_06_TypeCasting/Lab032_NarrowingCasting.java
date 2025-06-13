package ex_06_TypeCasting;

public class Lab032_NarrowingCasting {
    public static void main(String[] args) {
        int a = 300;
        //byte b = a; // Implicit Casting is not allowed in Narrowing
        //Large to small
        byte b = (byte) a; //Explicit Casting - telling JVM explicitly to convert int to byte - large to small
        System.out.println(b);
    }
}
