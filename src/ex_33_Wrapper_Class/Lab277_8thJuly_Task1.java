package ex_33_Wrapper_Class;

public class Lab277_8thJuly_Task1 {
    public static void main(String[] args) {
        int a = 50;
        System.out.println("Primitive: "+a);
        Integer b = a;
        System.out.println("Wrapper: "+b);
        int c = b;
        System.out.println("Unboxed again: "+c);
    }
}
