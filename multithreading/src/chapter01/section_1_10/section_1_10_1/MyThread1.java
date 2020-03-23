package chapter01.section_1_10.section_1_10_1;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
