package ex_15_Functions;

public class Lab123_FunctionAllTypes {
    public static void main(String[] args) {
        Without_Parameter_Without_Return();
        int returnvalue = Without_Parameter_With_Return();
        System.out.println(returnvalue);
        With_Parameter_Without_Return("Vicky", 33, 1000);
        int Sum = With_Parameter_With_Return(4,5,6);
        System.out.println("Sum =" +Sum);
    }
    static void Without_Parameter_Without_Return()
    {
        System.out.println("No return");
    }
    static int Without_Parameter_With_Return()
    {
        return 15;
    }
    static void With_Parameter_Without_Return(String name, int age, int salary)
    {
        System.out.println("Name is " + name+ "Age is " + age + "Salary is " + salary);
    }
    static int With_Parameter_With_Return(int a, int b, int c)
    {
        return a+b+c;
    }
}
