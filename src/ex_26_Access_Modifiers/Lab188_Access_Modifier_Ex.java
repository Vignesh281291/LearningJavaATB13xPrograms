package ex_26_Access_Modifiers;

public class Lab188_Access_Modifier_Ex {
    public static void main(String[] args) {
        Son s = new Son();
        s.canUse();
    }
}
class Father
{
    int a = 10;
    public int b = 25;
    private String s = "I'm Private";
}
class Son extends Father
{
    void canUse()
    {
        System.out.println(a);
        System.out.println(b);
        //System.out.println(s); // Can't use s as it is private
    }
}
