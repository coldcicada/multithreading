package chapter01.section_1_10.section_1_10_1;

/**
 * 线程优先级具有继承特性，比如A线程启动B线程，则B线程的优先级与A是一样的
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getName());
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
