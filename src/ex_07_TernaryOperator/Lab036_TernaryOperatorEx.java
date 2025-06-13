package ex_07_TernaryOperator;

public class Lab036_TernaryOperatorEx {
    public static void main(String[] args) {
        //Find Max or Min number between 2 numbers
        int Num1 = 20;
        int Num2 = 30;
        //int Max = Num1 > Num2 ? Num1 : Num2;
        int Min = Num1 < Num2 ? Num1 : Num2;
        //System.out.println(Max);
        System.out.println(Min);
    }
}
