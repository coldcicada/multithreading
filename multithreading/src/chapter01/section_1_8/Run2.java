package chapter01.section_1_8;

public class Run2 {
    public static void main(String[] args) {
        try {
            MyThread2 t = new MyThread2();
            t.start();
            Thread.sleep(1000);
            t.suspend();
            System.out.println("main end!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
