package ex_07_TernaryOperator;

public class Lab039_NestedTernaryEx {
    public static void main(String[] args) {
        //Login building
        //Step 1 - Find I/O and O/P and its datatypes
        // n1, n2, n3 - int
        // Max - String
        int n1 = 5;
        int n2 = 10;
        int n3 = -3;
        //Step 2 - Rough logic
        //n1>n2 and n1>n3 - n1 is max
        //n2>n3 and n2>n1 - n2 is max
        //n3

        //Step 3
        // Actual logic
        //int max = (n1>n2) ? A : B
        //A - (n1>n3) ? n1 : n3
        //B - (n2>n3) ? n2 : n3
        int Max = (n1>n2) ? (n1>n3) ? n1 : n3 : (n2>n3) ? n2 : n3;
        System.out.println(Max);

    }
}
