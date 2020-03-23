package chapter01.section_1_7.section_1_7_3;

/**
 * 能停止的线程----break
 * 虽然能停止线程，但如果for下面还有代码语句，还是会执行
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println(Thread.currentThread().getName());
                System.out.println("已经是停止状态了，退出！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
