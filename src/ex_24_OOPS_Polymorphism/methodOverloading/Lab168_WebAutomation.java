package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab168_WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
        b1.startBrowser();
    }
}
class Browser {

    void startBrowser() {
        System.out.println("Starting a default browser");
    }

    String startBrowser(String browser) {
        System.out.println("Starting browser " + browser);
        return browser;
    }
}
