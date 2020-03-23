package chapter01.section_1_6;

/**
 * getId()方法
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
