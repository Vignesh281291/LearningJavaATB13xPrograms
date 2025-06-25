package ex_19_Arrays;

public class Lab138_Arrays2 {
    public static void main(String[] args) {

        //String datatype in array
        String[] name = new String[3];
        name[0] = "Vignesh";
        System.out.println(name[0].length());

        //other datatypes in array
        Boolean[] truefalse = new Boolean[2];
        truefalse[0] = true;
        truefalse[1] = false;
        System.out.println(truefalse[0]);
        System.out.println(truefalse[1]);
    }
}
