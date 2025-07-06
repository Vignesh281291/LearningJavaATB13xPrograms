package ex_23_OOPS_Inheritance.MultiLevel_Inheritance;

public class Lab178_Multilevel_Inheritance_Task {
    public static void main(String[] args) {

        SuperAdmin_User sa = new SuperAdmin_User();
        sa.login();
        sa.accessAdminPanel();
        sa.shutdownSystem();
    }
}
class User
{
    void login()
    {
        System.out.println("User login");
    }
}
class Admin_User extends User
{
    void accessAdminPanel()
    {
        System.out.println("Admin Panel");
    }
}
class SuperAdmin_User extends Admin_User
{
    void shutdownSystem()
    {
        System.out.println("Super Admin");
    }
}