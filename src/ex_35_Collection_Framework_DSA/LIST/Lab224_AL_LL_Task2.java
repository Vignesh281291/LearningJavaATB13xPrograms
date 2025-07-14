package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Lab224_AL_LL_Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Amit");
        arrayList.add("Neha");
        arrayList.add("Suresh");
        System.out.println(arrayList);
        System.out.println("Remove Neha from the List");
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
