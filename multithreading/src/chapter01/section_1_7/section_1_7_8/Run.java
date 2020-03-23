package chapter01.section_1_7.section_1_7_8;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.sleep(2000);
        thread.interrupt();
    }
}
