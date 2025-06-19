package ex_16_LiveTest;

public class Lab112_Code5 {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 2;
        int prec = a+b+c*a+a-b+a/c; //a+b+(c*a)+a-b+(a/c) ->a+b+20+a-b+5
        System.out.println(prec);
    }
}
