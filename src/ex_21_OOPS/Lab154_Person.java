package ex_21_OOPS;

public class Lab154_Person {
    public static void main(String[] args) {

        //Person's attributes, properties, variables
        String F_name = "TestF";
        String L_name = "TestL";
        int age = 30;
        boolean is_married = true;
        //Person abc = new Person;  -  abc is the object reference  -  new Person is the object
    }
        //Person's behavior -> methods/functions
        public void eat()
        {
            System.out.println("Eating");
        }
        public String walk()
        {
            System.out.println("Walking");
            return null;
        }
        public void sleep(int time)
        {
            System.out.println("Sleeping");
        }
        public String play(String name)
        {
            System.out.println("Playing");
            return null;
        }
    }
