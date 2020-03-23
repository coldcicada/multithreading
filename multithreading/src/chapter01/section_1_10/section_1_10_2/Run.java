package chapter01.section_1_10.section_1_10_2;

/**
 * 线程优先级具有规则性
 * 1.高优先级的线程总是大部分先执行完，但不代表高优先级的线程全部先执行完
 * 2.当现成优先级的等级差距很大时，谁先执行完和代码的调用顺序无关
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 t1 = new MyThread1();
            t1.setPriority(10);
            t1.start();
            MyThread2 t2 = new MyThread2();
            t2.setPriority(1);
            t2.start();
        }
    }
}
