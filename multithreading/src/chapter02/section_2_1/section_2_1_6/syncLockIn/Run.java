package chapter02.section_2_1.section_2_1_6.syncLockIn;

/**
 * 可重入锁支持在父子类继承的环境中
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
