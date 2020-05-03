package chapter04.section_4_1.section_4_1_3;

/**
 * condition错误演示：
 * 出错异常信息事件时期出错，解决方法是在condition.await()方法之前调用lock.lock()获得同步监视器
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
