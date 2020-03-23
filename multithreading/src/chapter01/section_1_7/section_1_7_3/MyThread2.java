package chapter01.section_1_7.section_1_7_3;

/**
 * 能停止的线程----异常法
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了，退出！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出，线程未停止！");
        } catch (InterruptedException e) {
            System.out.println("进入MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}
