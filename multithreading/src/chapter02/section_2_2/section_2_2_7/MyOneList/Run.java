package chapter02.section_2_2.section_2_2_7.MyOneList;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread1 t1 = new MyThread1(list);
        t1.setName("A");
        t1.start();
        MyThread2 t2 = new MyThread2(list);
        t2.setName("B");
        t2.start();
        Thread.sleep(6000);
        System.out.println("listSize=" + list.getSize());
    }
}
