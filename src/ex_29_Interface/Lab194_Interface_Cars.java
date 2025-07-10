package ex_29_Interface;

public class Lab194_Interface_Cars {
    public static void main(String[] args) {
        Cars c = new Cars();
        c.drive();
    }
}
    class Cars implements Brakes,Engines{
        public void drive()
        {
            startEngine();
            applyBreak();
            stopEngine();
            defaultEngine();
        }
        @Override
        public void applyBreak() {
            System.out.println("Apply break");
        }

        @Override
        public void startEngine() {
            System.out.println("Engine Starts");
        }

        @Override
        public void stopEngine() {
            System.out.println("Engine Stops");
        }
    }


interface Brakes{
    void applyBreak();
}
interface Engines{
    void startEngine();
    void stopEngine();
    default void defaultEngine()
    {
        System.out.println("This is default class - does not act as a abstract class");
    }
}
