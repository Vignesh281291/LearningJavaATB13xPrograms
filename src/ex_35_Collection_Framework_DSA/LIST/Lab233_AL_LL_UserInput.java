package ex_35_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Lab233_AL_LL_UserInput {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList();
        String continueInput = "Y";

        while(continueInput.equalsIgnoreCase("Y"))
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Student Name");
            String name = s.next();
            names.add(name);
            System.out.println("Enter Student Age");
            Integer age = s.nextInt();
            ages.add(age);
            s.nextLine();
            System.out.println("Continue:");
            continueInput = s.nextLine();
        }
        for(Object nameList: names) {
            System.out.println(nameList);
        }
        for (Object ageList: ages) {
            System.out.println(ageList);
        }
    }
}
