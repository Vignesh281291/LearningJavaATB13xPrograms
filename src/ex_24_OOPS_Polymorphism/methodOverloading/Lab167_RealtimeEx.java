package ex_24_OOPS_Polymorphism.methodOverloading;

public class Lab167_RealtimeEx {
    public static void main(String[] args) {
        Home h = new Home();
        h.task();
        int taski = h.task(5);
        System.out.println(taski);
        boolean taskb = h.task(true);
        System.out.println(taskb);
    }
}
class Home
        {
            void task()
            {
                System.out.println("Task1");
            }
            int task(int a) {
                return a;
            }
            boolean task(boolean a)
            {
                return false;
            }
        }