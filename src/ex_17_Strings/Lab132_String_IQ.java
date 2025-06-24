package ex_17_Strings;

public class Lab132_String_IQ {
    public static void main(String[] args) {
        String s1 = "vigneshv";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(6));
        System.out.println(s1.concat("Vihaana"));
        System.out.println(s1.contains("ne"));
        System.out.println(s1.equals("vigneshv"));
        System.out.println(s1.equalsIgnoreCase("vigneshv"));
        System.out.println(s1.indexOf('v'));
        System.out.println(s1.lastIndexOf("v"));
        System.out.println(s1.replace('v','V'));
        String split_name = "vignesh@123@456 abc";
        String[] Split_name = split_name.split("@");
        System.out.println(Split_name[0]);
        System.out.println(Split_name[1]);
        System.out.println(Split_name[2]);
        System.out.println(s1.substring(1,3));
        System.out.println(split_name.substring(0,10));
        String s2="Test";
        String s3="execute";
        String result = s2 + s3;
        System.out.println(result);
    }
}
