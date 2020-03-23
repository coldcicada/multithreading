package chapter01.section_1_7.section_1_7_5;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(8000);
            myThread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
