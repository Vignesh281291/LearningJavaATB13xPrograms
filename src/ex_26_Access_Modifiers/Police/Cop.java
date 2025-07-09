package ex_26_Access_Modifiers.Police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int bullet) {
        this.gun = bullet;

    }
protected void canIshoot()
{
    System.out.println("Yes, you can!");
}
void defaultfunc()
{
    System.out.println("This is default func");
}
}