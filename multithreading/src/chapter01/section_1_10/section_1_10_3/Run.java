package chapter01.section_1_10.section_1_10_3;

/**
 * 优先级具有随机性
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 t1 = new MyThread1();
            t1.setPriority(5);
            t1.start();
            MyThread2 t2 = new MyThread2();
            t2.setPriority(6);
            t2.start();
        }
    }
}
