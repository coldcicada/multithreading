package chapter04.section_4_1.section_4_1_8;

/**
 * 实现生产者/消费者模式：多对多交替打印
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] a = new ThreadA[10];
        ThreadB[] b = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ThreadA(service);
            b[i] = new ThreadB(service);
            a[i].start();
            b[i].start();
        }
    }
}
