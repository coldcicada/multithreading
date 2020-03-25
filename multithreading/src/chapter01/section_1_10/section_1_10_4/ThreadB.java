package chapter01.section_1_10.section_1_10_4;

public class ThreadB extends Thread {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
