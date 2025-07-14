package ex_35_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;
//LinkedList can have duplicate values whereas ArrayList cannot have
public class Lab219_LinkedList_Imp {
    public static void main(String[] args) {
        List LL = new LinkedList();
        LL.add("1");
        LL.add("Test");
        LL.add("1");
        LL.add(25);
        System.out.println(LL);
    }
}
