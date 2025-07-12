package ex_32_ENUM;

public enum Locators {
    Username("locator1"),
    Password("locator2"),
    Login_btn("click_btn");

    String Locators;

    Locators(String Locators) {
        this.Locators = Locators;
    }

    public String getLocators() {
        return Locators;
    }
}
