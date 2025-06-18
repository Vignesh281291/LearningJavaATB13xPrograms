package ex_14_DoWhile_Loop;

public class Lab104_Do_WhileLoop {
    public static void main(String[] args) {
        int i=1;
        do //do something and check the condition later
        {
            System.out.println("This body will execute at least once and then checks for the condition");
            System.out.println(i);
            i++;
        }while (i>10);
    }
}
