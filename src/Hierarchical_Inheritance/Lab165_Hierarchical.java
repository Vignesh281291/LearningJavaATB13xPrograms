package Hierarchical_Inheritance;

public class Lab165_Hierarchical {

    public static void main(String[] args) {
        Father f1 = new Father();
        f1.homeFather();
        Son s1 = new Son();
        s1.homeSon();
        s1.homeFather();
        Daughter1 d1 = new Daughter1();
        d1.homeFather();
        d1.homeDaughter1();
    }
}

class Father{
    void homeFather(){
        System.out.println("Father's Home - 3BHK");
    }
}

class Son extends Father{
    void homeSon(){
        System.out.println("Son's Home - 2BHK");
    }
}

class Daughter1 extends Father{

    void homeDaughter1(){
        System.out.println("Daughter1's Home - 2BHK");
    }
}

class Daughter2 extends Father {
    void homeDaughter2(){
        System.out.println("Daughter2's Home - 1BHK");
    }
}