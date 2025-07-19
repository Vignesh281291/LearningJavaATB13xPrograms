package ex_29_Interface;

public class Lab276_7thJuly_Task8 {
    public static void main(String[] args) {
        Playable p1;
        p1=new Guitar();
        p1=new Piano();
        p1.play();
        p1.play();
    }
}
interface Playable
{
    void play();
}
class Guitar implements Playable
{

    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable
{

    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}
