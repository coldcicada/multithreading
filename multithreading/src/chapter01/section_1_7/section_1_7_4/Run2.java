package chapter01.section_1_7.section_1_7_4;

public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.interrupt();
        System.out.println("end!");
    }
}
