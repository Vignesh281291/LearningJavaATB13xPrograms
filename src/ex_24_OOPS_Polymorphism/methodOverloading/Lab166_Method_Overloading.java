package ex_24_OOPS_Polymorphism;

public class Lab166_Method_Overloading {
    public void main(String[] args) {
        MathOperation m = new MathOperation();
        int a1 = m.add(4, 6);
        int a2 = m.add(3, 6, 7);
        double d1 = m.add(2.5, 6.7);
        String s1 = m.add("Vignesh", "Sadhasivam");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(d1);
        System.out.println(s1);
    }

    class MathOperation {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }

        String add(String a, String b) {
            return a + b;
        }
    }
}
