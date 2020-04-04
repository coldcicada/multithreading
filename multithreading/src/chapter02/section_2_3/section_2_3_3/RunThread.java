package chapter02.section_2_3.section_2_3_3;

public class RunThread extends Thread {
    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了！");
        while (isRunning == true) {
            // do nothing
        }
        System.out.println("线程被停止！");
    }
}
