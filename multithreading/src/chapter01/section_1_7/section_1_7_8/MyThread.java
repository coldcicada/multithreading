package chapter01.section_1_7.section_1_7_8;

/**
 * 适用return停止线程
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
