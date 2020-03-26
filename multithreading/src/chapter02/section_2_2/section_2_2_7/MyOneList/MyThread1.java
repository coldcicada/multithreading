package chapter02.section_2_2.section_2_2_7.MyOneList;

public class MyThread1 extends Thread {
    private MyOneList list;

    public MyThread1(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
