package ex_35_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.Vector;

public class Lab222_Vector_Imp {
    public static void main(String[] args) {
        Vector v = new Vector(10);
        v.add("String");
        v.add("This");
        v.add("is");
        v.add("a list");
        v.add("using");
        v.add("Vector");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println("-------For-------");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println("------For each--------");
        for(Object o:v){
            System.out.println(o);
        }
        System.out.println("------Iterator------");
        //irrespective of datatype
        Iterator iterator = v.iterator();
        while(iterator.hasNext()) //until we have the element available
        {
            System.out.println(iterator.next()); //it ll print the elements
        }
    }
}
