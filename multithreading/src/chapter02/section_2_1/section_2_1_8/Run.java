package chapter02.section_2_1.section_2_1_8;

public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA a = new ThreadA(sub);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(sub);
        b.setName("B");
        b.start();
    }
}
