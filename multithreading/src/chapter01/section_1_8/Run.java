package chapter01.section_1_8;

/**
 * 线程暂停
 * suspend与resume方法的使用
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(5000);
            // A段
            t.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + t.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + t.getI());
            // B段
            t.resume();
            Thread.sleep(5000);
            // C段
            t.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + t.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + t.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
