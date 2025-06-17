package ex_11_Switch;

public class Lab081_Switch_InterviewQ {
    public static void main(String[] args) {
        int a =10; // this variable dec is not at all used
        switch (-1)
        {
            case -1:
                System.out.println("10");
                break;
            case 8:
                System.out.println("8");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
