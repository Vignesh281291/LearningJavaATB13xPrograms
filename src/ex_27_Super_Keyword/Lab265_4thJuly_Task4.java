package ex_27_Super_Keyword;

public class Lab265_4thJuly_Task4 {
    public static void main(String[] args) {
P p = new P();
String Name = p.getName();
int i = p.getA();
        System.out.println(Name);
        System.out.println(i);
    }
}
class P
{
    private int a = 10;
    private String name = "abcd";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
