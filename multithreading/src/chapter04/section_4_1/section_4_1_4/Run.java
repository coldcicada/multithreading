package chapter04.section_4_1.section_4_1_4;

/**
 * 正确使用condition实现通知/等待
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
