package chapter01.section_1_7.section_1_7_3;

public class Run2 {
    public static void main(String[] args) {
        try {
            MyThread2 myThread = new MyThread2();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
