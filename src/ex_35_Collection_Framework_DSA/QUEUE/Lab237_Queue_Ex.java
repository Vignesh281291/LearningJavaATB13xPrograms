package ex_35_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab237_Queue_Ex {
    public static void main(String[] args) {
        //natural ordering
        Queue q = new PriorityQueue();
        q.add("Vignesh");
        q.add("Sadhasivam");
        q.add("Priya");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
