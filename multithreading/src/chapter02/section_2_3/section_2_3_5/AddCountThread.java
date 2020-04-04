package chapter02.section_2_3.section_2_3_5;
/**
 * 使用原子类进行i++操作
 */

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
