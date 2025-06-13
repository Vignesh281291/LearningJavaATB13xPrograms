package ex_06_TypeCasting;

public class Lab034_NarrowingEx {
    public static void main(String[] args) {
        int Course = 100;
        float GST = 15.5f;
        //int TotalAmount = Course + (int)GST; // .5 data loss
        float TotalAmount = Course + (float)GST; //use the right datatype (float) when converting
        System.out.println(TotalAmount);
    }
}
