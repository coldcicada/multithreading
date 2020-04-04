package chapter02.section_2_3.section_2_3_4;

/**
 * volatile非原子特性
 */
public class MyThread extends Thread {
    /*volatile*/ public static int count;

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
