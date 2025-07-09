package ex_26_Access_Modifiers.Police;

public class JrCop {
    public static void main(String[] args) {
Cop jr = new Cop(10);
jr.canIshoot(); // JrCop can use the Cop func as the func is protected which can be accessed within the package
        System.out.println(jr.gun);
        jr.defaultfunc();
    }
}
