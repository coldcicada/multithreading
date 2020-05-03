package chapter03.section_3_2.section_3_2_2;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我在执行，我做到了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
