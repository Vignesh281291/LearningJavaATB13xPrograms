package ex_32_ENUM;

public class Lab203_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.Sun);
        System.out.println(Proj_Names.Proj1);
        System.out.println(Proj_Names.Proj2);
        System.out.println(Proj_Names.Proj1);
    }
}

enum Day{
    Sun,Min,Tue,Wed,Thurs,Fri,Sat
}
enum Proj_Names{
    Proj1, Proj2, Proj3
}