package ex_26_Access_Modifiers.Criminal;

import ex_26_Access_Modifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop th = new Cop(5);
        // c.canIshoot(); Thief can't use this func as this is a diff package
        int t = th.gun;
        System.out.println(t);
    }
}
