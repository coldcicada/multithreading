package chapter01.section_1_11;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}