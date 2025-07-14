package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab226_AL_LL_Task4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Mumbai");
        arrayList.add("Delhi");
        arrayList.add("Pune");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the City: ");
        String FindCity = s.nextLine();
        s.close();

       if(arrayList.contains(FindCity))
        {
            System.out.println(FindCity + " is in the list");
        }
        else {
            System.out.println(FindCity + "is not in the list");
        }

    }
}
