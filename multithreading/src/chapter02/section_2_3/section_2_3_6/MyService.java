package chapter02.section_2_3.section_2_3_6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 原子类也并不完全安全
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    /*synchronized*/ public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是:" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
