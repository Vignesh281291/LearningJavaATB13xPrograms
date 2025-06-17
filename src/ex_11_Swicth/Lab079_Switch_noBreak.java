package ex_11_Swicth;

public class Lab079_Switch_noBreak {
    public static void main(String[] args) {
        int a=10;
        switch (a)
        {
            case 5 -> System.out.println("No match"); // no need of break as the JDK is > 13
            //one line is supported
            case 10 -> System.out.println("Match");
            default -> System.out.println("NA");
        }
    }
}
