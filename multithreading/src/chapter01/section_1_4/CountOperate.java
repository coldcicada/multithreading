package chapter01.section_1_4;

public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        super.run();
    }
}
