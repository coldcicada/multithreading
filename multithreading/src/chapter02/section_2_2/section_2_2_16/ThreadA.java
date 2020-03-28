package chapter02.section_2_2.section_2_2_16;


public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService service) {
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
