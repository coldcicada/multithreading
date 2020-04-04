package chapter02.section_2_3.section_2_3_7;

/**
 * Created by baihan on 2020/4/4.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
