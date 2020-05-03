package chapter04.section_4_1.section_4_1_2;

public class ThreadAA extends Thread {
    private MyService service;

    public ThreadAA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
