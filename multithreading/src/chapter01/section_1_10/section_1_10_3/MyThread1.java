package chapter01.section_1_10.section_1_10_3;

import java.util.Random;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thread1 use time=" + (endTime - beginTime));
    }
}
