import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("---MyThread begin---");
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println(Thread.currentThread() == this);
        System.out.println("---MyThread end---");
    }

    @Override
    public void run() {
        System.out.println("---run begin---");
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println(Thread.currentThread() == this);
        System.out.println("---run end---");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        Thread thread = new Thread(myThread);
        thread.setName("thread");
        thread.start();// thread嵌套实例对象启动线程
    }
}
