package chapter02.section_2_3.section_2_3_4;

public class Run {
    public static void main(String[] args) {
        MyThread[] mythreadArr = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            mythreadArr[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            mythreadArr[i].start();
        }
    }
}
