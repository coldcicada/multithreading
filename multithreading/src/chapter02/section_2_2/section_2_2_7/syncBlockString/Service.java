package chapter02.section_2_2.section_2_2_7.syncBlockString;

public class Service {
    private String anyString = new String();

    public void methodA() {
        try {
            synchronized (anyString) {
                System.out.println("methodA begin");
                Thread.sleep(3000);
                System.out.println("methodA end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB() {
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
