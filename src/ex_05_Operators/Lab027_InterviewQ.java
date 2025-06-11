package ex_05_Operators;

public class Lab027_InterviewQ {
    public static void main(String[] args) {
        String a = "Test";
        String b = "Code";
        int c = 1;
        int d = 2;
        System.out.println(a + b + c + d); //first operation will be carried for next operation
        System.out.println(c + d + a + b); //first operation will be carried for next operation
    }
}
