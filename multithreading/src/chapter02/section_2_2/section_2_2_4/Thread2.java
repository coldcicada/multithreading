package chapter02.section_2_2.section_2_2_4;

public class Thread2 extends Thread {
    private Task task;

    public Thread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
