package chapter01.section_1_7.section_1_7_4;

/**
 * 在沉睡中停止----先interrupt再sleep
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep进入了catch");
            e.printStackTrace();
        }
    }
}
