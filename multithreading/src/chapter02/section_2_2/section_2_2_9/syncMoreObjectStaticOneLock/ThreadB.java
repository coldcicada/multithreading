package chapter02.section_2_2.section_2_2_9.syncMoreObjectStaticOneLock;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
