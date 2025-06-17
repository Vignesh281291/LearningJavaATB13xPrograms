package ex_11_Switch;

import java.util.Scanner;

public class Lab075_Switch_BrowserAuto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browser = s.next();
        browser = browser.toLowerCase();
        switch (browser)
        {
            case "chrome":
                System.out.println("Launch Chrome");
                break;
            case "firefox":
                System.out.println("Launch Firefox");
                break;
            case "edge":
                System.out.println("Launch Edge");
                break;
            default:
                System.out.println("Not sure which browser to use");
                break;
        }
    }
}
