package ex_24_OOPS_Polymorphism.methodOverriding;

public class Lab187_Method_Overriding_Task4 {
    public static void main(String[] args)
    {
        User u = new User();
        AdminUser a = new AdminUser();
        RegUser r = new RegUser();
        u.login();
        a.login();
        r.login();
    }
}
class User
{
    void login()
    {
        System.out.println("User Login");
    }
}
class AdminUser extends User
{
    void login()
    {
        System.out.println("Logging in as Admin User");
    }
}
class RegUser extends User
{
    void login()
    {
        System.out.println("Logging in as Regular User");
    }
}