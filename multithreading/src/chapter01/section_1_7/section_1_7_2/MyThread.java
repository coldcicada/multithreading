package chapter01.section_1_7.section_1_7_2;

/**
 * interrupted(): 测试当前线程是否已经中断
 * isInterrupted(): 测试线程是否已经中断
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
