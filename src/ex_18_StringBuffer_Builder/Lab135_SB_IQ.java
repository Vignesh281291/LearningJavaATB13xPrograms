package ex_18_StringBuffer_Builder;

public class Lab135_SB_IQ {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Test@123");
        s1.append("@456");
        System.out.println(s1);
        s1.delete(0,8);
        System.out.println(s1);
        s1.replace(0, 1, "AB");
        System.out.println(s1);
    }
}
