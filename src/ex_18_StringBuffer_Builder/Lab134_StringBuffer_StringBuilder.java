package ex_18_StringBuffer_Builder;

public class Lab134_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer("Vignesh"); //Immutable. Thread safe
        //new value will be VigneshVihaana - Vignesh is removed and VigneshVihaana will be the final value
        System.out.println(sbuff.append("Vihaana"));
        //String reverse func
        System.out.println(sbuff.reverse());


        StringBuilder sbuild = new StringBuilder("Priya"); //Immutable , Not Thread safe
        System.out.println(sbuild.append("Vihaana"));
        sbuild.reverse();
        System.out.println(sbuild);
    }
}
