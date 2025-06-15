package ex_07_TernaryOperator;

public class Lab054_TernaryOperator_Task3 {
    public static void main(String[] args) {
       int mark1 = 45;
       String grade = (mark1== 90) ? "A+" : (mark1==75) ? "A" : (mark1==60)?"B" : (mark1==40)?"C": (mark1<40)?"FAIL":"pass";
       System.out.println(grade);

      /*
int a=85;
        String result=(a>=90)?"A+":(a<90 && a>=75)?"A":(a<75 && a>=60)?"B":(a<60 && a>=40)?"C":"Fail";
        System.out.println(result);
*/

   }
}
