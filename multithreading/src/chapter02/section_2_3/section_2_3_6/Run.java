package chapter02.section_2_3.section_2_3_6;

/**
 * Created by baihan on 2020/4/4.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] threadArr = new MyThread[5];
            for (int i = 0; i < threadArr.length; i++) {
                threadArr[i] = new MyThread(service);
            }
            for (int i = 0; i < threadArr.length; i++) {
                threadArr[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
