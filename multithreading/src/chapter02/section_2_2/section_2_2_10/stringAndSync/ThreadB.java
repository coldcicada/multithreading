package chapter02.section_2_2.section_2_2_10.stringAndSync;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
