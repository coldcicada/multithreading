package chapter01.section_1_8;

public class MyThread2 extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);//内部的锁在suspend操作不会释放
        }
    }
}
