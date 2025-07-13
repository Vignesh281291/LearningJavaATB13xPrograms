package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab216_List_Ex {
    public static void main(String[] args) {
        List l = new ArrayList(); //Dynamic Dispatch - List is Father, ArrayList is Child
        //ArrayList al = new ArrayList();
        l.add("Test");
        l.add(123);
        l.add(true);

    }
}
