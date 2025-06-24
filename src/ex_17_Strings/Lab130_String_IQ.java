package ex_17_Strings;

public class Lab130_String_IQ {
    public static void main(String[] args) {
        String s1 = "Vignesh";
        String s2 = "VIGNESH"; //SCP -> 1 Stores 1 value since the value is same
        String s3 = "Vicky";
        String s4 = "Vihaana"; //SCP -> 2
        String s5 = new String("Vicky");
        String s6 = new String("Vihaana");
        String s7 = new String("Vignesh"); // OA -> 3 Stores 3 value in 3 different object area
        // == -> checks the location reference
        //equals -> checks content- value
        System.out.println(s1.equals(s4));
        System.out.println(s3==s5);
        System.out.println(s3.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
