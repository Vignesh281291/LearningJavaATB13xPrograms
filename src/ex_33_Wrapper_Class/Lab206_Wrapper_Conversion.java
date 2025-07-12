package ex_33_Wrapper_Class;

public class Lab206_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //This is called Boxing // primitive to wrapper auto boxing
        System.out.println(b.intValue());
        System.out.println(b.MIN_VALUE);

        Integer c = 20;
        int d = b; // unboxing
        System.out.println(c);
    }
}
