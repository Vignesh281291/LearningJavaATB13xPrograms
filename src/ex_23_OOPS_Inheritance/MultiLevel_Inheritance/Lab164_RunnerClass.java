package ex_23_OOPS_Inheritance.MultiLevel_Inheritance;

public class Lab164_RunnerClass {
    public static void main(String[] args) {
        Lab161_GrandFather gf = new Lab161_GrandFather();
        System.out.println("*****Grand Father's Asset****");
        gf.GF();
        gf.GF_Home();
        System.out.println("*****Father's Asset*****");
        Lab162_Father f1 = new Lab162_Father();
        f1.GF();
        f1.GF_Home();
        f1.F();
        f1.home();
        System.out.println("****** Son's Asset ******");
        Lab163_Son s1 = new Lab163_Son();
        s1.GF();
        s1.GF_Home();
        s1.F();
        s1.home();
        s1.home(); // both this func call is invoking the Son's home func
        System.out.println("Dynamic Dispatch");
        //Lab163_Son s3 = new Lab162_Father(); Not possible
        Lab162_Father f2 = new Lab163_Son();//Dynamic Dispatch
        //Lab161_GrandFather gf2 =  new Lab162_Father();
        f2.home(); //this invokes son's home

    }
}
