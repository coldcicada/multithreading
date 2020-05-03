package chapter03.section_3_3.section_3_3_2;

public class ThreadB extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB" + (1 + i));
                System.out.println("ThreadB get value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
