package chapter03.section_3_3.section_3_3_1;


/**
 * ThreadLocal的使用：方法get()与null
 */
public class Run {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (null == t1.get()) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
