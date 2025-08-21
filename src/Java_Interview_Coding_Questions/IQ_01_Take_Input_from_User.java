package Java_Interview_Coding_Questions;

import java.util.Scanner;

public class IQ_01_Take_Input_from_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take user input - Name:");
        String name = sc.nextLine();
        System.out.println("Take user input - Age:");
        int age = sc.nextInt();
        System.out.println("Name is " + name + " Age is " + age);
        sc.close(); // Optional
    }
}
