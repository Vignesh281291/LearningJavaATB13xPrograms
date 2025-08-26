package Java_Interview_Coding_Questions;

public class test_Forloop {
    public static void main(String[] args) {
//        for (int i = 0; i <=5; i++) {
//            if(i>=2) {
//                System.out.println("execute");
//            }
//            else {
//                System.out.println("dont execute");
//            }
//        }
//        for (int i = 1; i >=-2; i--) {
//            System.out.println("Test");
//        }
//        for (int i = 1; i <=50 ; i++) {
//            if(i%2==0)
//            {
//                System.out.println("Even Nos: " +i);
//            }
//            else {
//                System.out.println("Odd Nos: " +i);
//            }
//        }
//        for (int i = 0; i < 20; i++) {
//            if(i==10)
//            {
//                //System.out.println(i);
//                continue;
//                //break;
//            }
//            else{
//                System.out.println(i);
//            }
//        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
