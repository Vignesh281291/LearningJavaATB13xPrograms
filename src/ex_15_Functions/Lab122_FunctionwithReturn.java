package ex_15_Functions;

public class Lab122_FunctionwithReturn {
    public static void main(String[] args) {
        int Total = Sum(5, 7); // 5 and 7 will be passed to the func Sum(int a, int b)
        System.out.println(Total);
    }
    static int Sum(int a, int b)
    {
        return a+b; // this function returns the sum value which will be going to the Total
    }
}
