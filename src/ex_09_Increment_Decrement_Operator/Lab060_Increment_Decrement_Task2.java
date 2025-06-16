package ex_09_Increment_Decrement_Operator;

public class Lab060_Increment_Decrement_Task2 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);
        //Expression & Result Table
        //Line No  |  i  |  Result i
        //   5     |  1  |    -
        //   6     |  1 |    3
    }
}
