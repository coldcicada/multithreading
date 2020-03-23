package chapter01.section_1_7.section_1_7_4;

/**
 * 在沉睡中停止----先sleep再interrupt
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止!进入catch! isInterrupted:" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
