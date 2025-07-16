package ex_35_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab235_Set_HS {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        LinkedHashSet lhs = new LinkedHashSet();
        TreeSet ts = new TreeSet();
        hs.add("Test1");
        hs.add("Test2");
        hs.add("Test2"); //duplicates will npt be considered and takes the latest duplicated value
        System.out.println(hs);
    }
}
