package chapter02.section_2_2.section_2_2_16;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        Thread.sleep(50);
        threadB.start();
    }
}
