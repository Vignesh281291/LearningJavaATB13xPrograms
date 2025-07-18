package ex_35_Collection_Framework_DSA.MAP;

import java.util.Hashtable;

public class Lab242_HashTable_Ex {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        //Null value or Null key is not allowed
        //Thread safe
        //Legacy class and it is slow
        ht.put(1,"Test1");
        ht.put(3,"abc");
        //ht.put(5,null);
        //ht.put(null, "Null");
        System.out.println(ht);
    }
}
