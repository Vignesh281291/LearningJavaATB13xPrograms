package ex_16_LiveTest;

public class Lab112_Code5 {
    public static void main(String[] args) {
        //Precedence
        int a = 10, b = 5, c = 2;
        int prec = a+b+c*a+a-b+a/c; //a+b+(c*a)+a-b+(a/c) ->a+b+20+a-b+5
        System.out.println(prec);

        //Type Casting
        int t = 100;
        double d = (int) t;
        System.out.println(d);
        long mobile = 8508997953l;
        //short mobile2 = mobile; //Implicit narrowing not allowed
        short mobile2 = (short) mobile; //Explicit narrowing
        System.out.println(mobile2);
    }
}
