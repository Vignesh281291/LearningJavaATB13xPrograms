package ex_09_Increment_Decrement_Operator;

public class Lab059_Increment_Decrement_Task1 {
    public static void main(String[] args) {
        //a++ -> use and modify
        //++a -> modify and use
        int a = 10;
        int b = a++;
        System.out.println("a: " + a + ", b: " + b);
        //Expression & Result Table
        //Line No  |  a  |  Result b
        //   5     |  10 |    -
        //   6     |  11 |    10
    }
}
