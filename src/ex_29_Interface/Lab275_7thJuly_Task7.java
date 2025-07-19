package ex_29_Interface;

public class Lab275_7thJuly_Task7 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.displaySpeed();
    }
}
interface SpeedLimit
{
    final int MAX_SPEED = 120;
}
class Car1 implements SpeedLimit
{
void displaySpeed()
{
    System.out.println("Max speed is" + MAX_SPEED);
}
}