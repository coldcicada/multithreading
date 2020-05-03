package chapter04.section_4_1.section_4_1_2;

public class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
