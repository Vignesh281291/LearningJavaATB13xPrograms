package ex_11_Swicth;

public class Lab080_Switch_multiple_condition {
    public static void main(String[] args) {
        int a = 500;
        switch (a)
        {
            case 100,200,300:  // this ',' will act as 'OR'
                System.out.println("Gadget is mine");
                System.out.println("Gadget is mine");
                System.out.println("Gadget is mine");
                break;
            case 400,500,600:
                System.out.println("Gadget is yours");
                System.out.println("Gadget is yours");
                System.out.println("Gadget is yours");
                break;
            default:
                System.out.println("None");
                break;

        }
        }
    }
