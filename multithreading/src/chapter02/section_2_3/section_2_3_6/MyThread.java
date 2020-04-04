package chapter02.section_2_3.section_2_3_6;

/**
 * Created by baihan on 2020/4/4.
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
