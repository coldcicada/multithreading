package chapter02.section_2_2.section_2_2_9.syncMoreObjectStaticOneLock;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
