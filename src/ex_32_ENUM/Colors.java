package ex_32_ENUM;

public enum Colors {
    Red("Reddd"),
    Blue("Blueee"),
    Green("Greennn");

    String Colors;
    Colors(String Colors){
        this.Colors = Colors;
    }
    String getColors(){
        return Colors;
    }
}
