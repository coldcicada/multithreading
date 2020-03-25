package chapter02.section_2_1.section_2_1_4.synchronizedMethodLockObject;

public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }
}
