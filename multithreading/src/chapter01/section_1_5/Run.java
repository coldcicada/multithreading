package chapter01.section_1_5;

/**
 * sleep()
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin time=" + System.currentTimeMillis());
        //myThread.run();
        myThread.start();
        System.out.println("end time=" + System.currentTimeMillis());
    }
}
