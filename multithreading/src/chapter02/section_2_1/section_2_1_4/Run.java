package chapter02.section_2_1.section_2_1_4;

/**
 * synchronized方法与锁对象
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
