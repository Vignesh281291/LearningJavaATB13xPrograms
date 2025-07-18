package ex_35_Collection_Framework_DSA.MAP;

import java.util.Map;
import java.util.TreeMap;

public class Lab243_TreeMap_Ex {
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap();
        tm.put("Name",123);
        tm.put("Roll No", 456);
        tm.put("Age", 33);
        System.out.println(tm);
        System.out.println(tm.replace("Name",123,789));
        System.out.println(tm.replace("Age",44));
        System.out.println(tm.remove("Roll No"));
        System.out.println(tm);
    }
}
