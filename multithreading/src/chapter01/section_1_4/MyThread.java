package chapter01.section_1_4;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run == " + this.isAlive());
    }
}
