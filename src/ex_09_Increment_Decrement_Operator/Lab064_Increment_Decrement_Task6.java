package ex_09_Increment_Decrement_Operator;

public class Lab064_Increment_Decrement_Task6 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);
        //Expression & Result Table
        //Line No  |  x  |  Result y
        //   5     |  5  |    -
        //   6     |  5+7+7+9|    28
        //   7     |  9 |    -
        //   8     |  - |    28
    }
}
