package ex_22_OOPS_Constructor;

public class Lab155_Constructor1 {
    public static void main(String[] args) {
        car c = new car(); //creating object will invoke the constructor by default
        //c.model = "New model";
        //System.out.println(c.model);
        car c1 = new car(); //creating another object will invoke the constructor again
        car c2; //this does not create object, it is just a reference
        new car(); //this creates object for the class car, so the constructor is invoked by default
        //c.carParts();
    }
}
    class car {
        String model;
        int year;
        //below function is the Constructor for the class car
        //Constructor is actually initializing the values
        car() {
            System.out.println("Model name from constructor");
            System.out.println("Year from constructor");
        }
        void carParts()
        {
            System.out.println("Car-parts");
        }
    }