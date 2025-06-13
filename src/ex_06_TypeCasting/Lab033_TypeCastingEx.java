package ex_06_TypeCasting;

public class Lab033_TypeCastingEx {
    public static void main(String[] args) {
        long mobile = 8508997953l;
        //short mobile2 = mobile; //Implicit narrowing not allowed
        short mobile2 = (short) mobile; //Explicit narrowing
        System.out.println(mobile2);
    }
}
