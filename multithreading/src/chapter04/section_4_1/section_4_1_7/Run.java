package chapter04.section_4_1.section_4_1_7;

/**
 * 实现生产者/消费者模式：一对一交替打印
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
