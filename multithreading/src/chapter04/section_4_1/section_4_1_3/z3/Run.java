package chapter04.section_4_1.section_4_1_3.z3;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
    }
}
