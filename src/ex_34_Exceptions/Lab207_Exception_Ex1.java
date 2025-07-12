package ex_34_Exceptions;

public class Lab207_Exception_Ex1 {
    public static void main(String[] args) {
        System.out.println("Start...");
        String input = args[0];
        Integer a = Integer.parseInt(input);
        Integer output = 100/a; //unchecked exception - if user enter 0
        System.out.println(output);
        System.out.println("End...");
    }
}
