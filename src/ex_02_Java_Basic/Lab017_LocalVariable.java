package ex_02_Java_Basic;

public class Lab017_LocalVariable {
    public static void main(String[] args) {
        int a =10;
        {
            int b = 20;
            System.out.println(b);
        }
        int b = 30;
        System.out.println(b);
    }
}
