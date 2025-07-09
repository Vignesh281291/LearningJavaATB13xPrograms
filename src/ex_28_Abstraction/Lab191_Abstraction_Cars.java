package ex_28_Abstraction;

public class Lab191_Abstraction_Cars {
    public static void main(String[] args) {
        WagonR w = new WagonR();
        w.drive(); //here we are hiding the abstract class Engine from being shown to others
    }
}
abstract class Engine {
    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine() {
        System.out.println("Check Completed - All Good");
    }
}
class WagonR extends Engine{

    @Override // completing the incomplete abstract class by overriding the incomplete abstract functions
    void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car");
    }
    void drive()
    {
        checkEngine();
        startEngine();
        stopEngine();
    }
}