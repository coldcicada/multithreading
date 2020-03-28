package chapter02.section_2_2.section_2_2_10.stringAndSync;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
