package ex_25_Encapsulation;

public class Lab173_Encapsulation_Ex {
    public static void main(String[] args) {
        Login o1= new Login("Vignesh", "Password");
        String Username = o1.getUname();
        System.out.println(Username);
        o1.setUname("Vignesh123");
        String Username_new = o1.getUname();
        System.out.println(Username_new);
        String Password = o1.getPwd();
        System.out.println(Password);
        o1.setPwd("Password123",false);
        String Password_new = o1.getPwd();
        //System.out.println(Password_new);
    }
}
class Login
{
    private String uname;
    private String pwd;

    public Login(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd, boolean IsAdmin) {
        if(IsAdmin)
        {
            this.pwd = pwd;
        }
        else
        {
            System.out.println("Only Admin can change the password");
        }
    }
}
