package chapter01.section_1_7.section_1_7_6;

/**
 * 方法stop()与java.lang.ThreadDeath异常
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch()方法!");
            e.printStackTrace();
        }
    }
}
