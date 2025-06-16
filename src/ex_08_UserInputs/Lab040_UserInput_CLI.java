package ex_08_UserInputs;

public class Lab040_UserInput_CLI {
    public static void main(String[] args) {
        //Arguments entered in configuration will be automatically available in args
        // args is String, String needs to be converted to Int
        //String age1 = args [0];
        int age = Integer.parseInt(args [0]);
        System.out.println(age);
        String CanIVote = age>18 ? "Can Vote" : "Can't Vote";
        System.out.println(CanIVote);

    }
}
