package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lab227_AL_LL_Task5 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        long AL_StartTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ar.add(i);
        }
        long AL_EndTime = System.currentTimeMillis();

        LinkedList ll = new LinkedList();
        long LL_StartTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            ar.add(j);
        }
        long LL_EndTime = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (AL_EndTime - AL_StartTime) + "ms");
        System.out.println("LinkedList Time: " + (LL_EndTime - LL_StartTime) + "ms");
    }
}
