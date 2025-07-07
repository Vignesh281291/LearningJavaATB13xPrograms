package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab183_Method_Overloading_Task5 {
    public static void main(String[] args) {
        Utility u = new Utility();
        int max_of_two = u.max(4,5);
        System.out.println("Max of 2 numbers is: " + max_of_two);
        int max_of_three = u.max(3,1,4);
        System.out.println("Max of 3 numbers is: " + max_of_three);
        double max_of_2d = u.max(4.5, 4.7);
        System.out.println("Max of 2 decimal numbers is:" + max_of_2d);
    }
}
class Utility {
    int max(int a, int b) {
        if (a > b)
            return a;
        else {
            return b;
        }
    }

    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}