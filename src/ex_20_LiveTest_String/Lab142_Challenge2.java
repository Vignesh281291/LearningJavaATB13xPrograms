package ex_20_LiveTest_String;

public class Lab142_Challenge2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2)); // content
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1==s2); //reference
        System.out.println(s1.compareTo(s2));
    }
}
