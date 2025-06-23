package ex_15_Functions;

public class Lab121_MultipleFunctions {
    public static void main(String[] args) {
        num();
        bool();
        flt();
        string();
        noreturn();
    }

    static void noreturn() {
        System.out.println("This will not return anything");
    }

    static int num() {
        System.out.println("Integer");
        return 10;
    }

    static boolean bool() {
        System.out.println("Boolean");
        return true;
    }

    static float flt() {
        System.out.println("Float");
        return 2.5f;
    }

    static String string() {
        System.out.println("String");
        return "Vicky";
    }
}
