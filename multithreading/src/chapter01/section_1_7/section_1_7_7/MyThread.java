package chapter01.section_1_7.section_1_7_7;


public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("lisi", "654321");
    }
}
