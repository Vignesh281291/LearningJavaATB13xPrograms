package ex_30_Static;

public class Lab202_Static_WebAutomationEx {
    public static void main(String[] args) {
        WebAutomation TC1 = new WebAutomation();
        System.out.println(WebAutomation.driver);
        WebAutomation TC2 = new WebAutomation();
        System.out.println(WebAutomation.driver);
        TC1.launchDriver();
        TC2.launchDriver();
    }

}
class WebAutomation {
    static String driver = "Chrome";
    void launchDriver() {
        System.out.println(driver);
    }
}