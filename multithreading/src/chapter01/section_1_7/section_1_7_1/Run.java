package chapter01.section_1_7.section_1_7_1;

/**
 * interrupt()只是在当前线程中打了一个停止标记，并不是真正的停止线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
