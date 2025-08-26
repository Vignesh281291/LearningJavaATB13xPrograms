package Java_Interview_Coding_Questions;

public class test_Nested_Forloop {
    public static void main(String[] args) {
        int n = 5;

//        System.out.println("-------Pyramid------");
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j<n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <=(2*i-1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        System.out.println("-------Square------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        System.out.println("-------Right Triangle------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        System.out.println("-------Inverted Triangle------");
//        for (int i = n; i >= 1 ; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        System.out.println("-------Number Triangle------");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
