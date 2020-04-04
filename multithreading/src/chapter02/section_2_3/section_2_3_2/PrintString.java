package chapter02.section_2_3.section_2_3_2;

public class PrintString implements Runnable {
    @Override
    public void run() {
        printStringMethod();
    }

    private volatile boolean isContinuePrint = true;

    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint) {
                System.out.println("run printStirngMethod threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
