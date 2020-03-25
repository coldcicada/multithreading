package chapter02.section_2_1.section_2_1_4.synchronizedMethodLockObject;

/**
 * A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法
 * A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
