package ex_35_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab229_Stack_Ex {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Test1");
        s.add("Test2");
        s.add("Test3");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);


        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1);
    }
}