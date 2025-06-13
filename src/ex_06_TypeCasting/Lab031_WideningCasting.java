package ex_06_TypeCasting;

public class Lab031_WideningCasting {
    public static void main(String[] args) {
        byte a = 10;
        //Widening - small to large
        //int b = a; // implicit widening casting
        int b  = (int)a; // explicit widening casting
        //JVM automatically tells compiler to convert - does not require explicit widening casting
        System.out.println(b);


    }
}
