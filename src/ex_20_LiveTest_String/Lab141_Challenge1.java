package ex_20_LiveTest_String;

public class Lab141_Challenge1 {
    //Write a Java program that demonstrates basic string operations including concatenation,
    // length, substring, and character extraction.
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat("World");
        System.out.println(s2);
        System.out.println("Length: " + s2.length());
        System.out.println("First Char: " + s2.charAt(0));
        System.out.println("Substring: " + s2.substring(5,10));
    }
}
