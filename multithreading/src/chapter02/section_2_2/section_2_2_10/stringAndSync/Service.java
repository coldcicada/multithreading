package chapter02.section_2_2.section_2_2_10.stringAndSync;

public class Service {
    public static void print(Object o) {
        try {
            synchronized (o) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
