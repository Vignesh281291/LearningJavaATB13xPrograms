package ex_29_Interface;

public class Lab195_Interface_Multiple_Inheritance_Ex {
    public static void main(String[] args) {
        Son s = new Son();
        s.money();
        s.gold();
        s.house();
        System.out.println("Getting Father's Cash as well");
        s.cashSon();
    }
}
interface Father1{
    int cash = 100;
    void money();
    void house();
    default void gold()
    {
        System.out.println("Father1's Gold");
    }
}
interface Father2{
    int cash = 200;
    void money();
    void house();
    default void gold()
    {
      System.out.println("Father2's Gold");
    }
}

class Son implements Father1, Father2{
    void cashSon()
    {
        System.out.println(Father1.cash);
        System.out.println(Father2.cash);
    }

    @Override
    public void money() {
        System.out.println("Inheriting from Father");
    }

    @Override
    public void house() {
        System.out.println("Inheriting from Father");
    }

    @Override
    public void gold() {
        Father1.super.gold();
        Father2.super.gold();
    }
}
