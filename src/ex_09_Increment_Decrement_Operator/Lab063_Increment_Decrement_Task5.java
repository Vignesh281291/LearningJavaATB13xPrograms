package ex_09_Increment_Decrement_Operator;

public class Lab063_Increment_Decrement_Task5 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a); // 5+7 - > a will be 7 snd b will be 12
        System.out.println("b: " + b);
        //Expression & Result Table
        //Line No  |  a  |  Result b
        //   5     |  5  |    -
        //   6     |  6+6 |    12
        //   7     |  7 |    -
        //   8     |  - |    12
    }
}
