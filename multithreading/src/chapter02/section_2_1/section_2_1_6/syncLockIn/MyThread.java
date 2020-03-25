package chapter02.section_2_1.section_2_1_6.syncLockIn;

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
