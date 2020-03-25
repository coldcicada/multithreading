package chapter02.section_2_1.section_2_1_2;

/**
 * 实例变量非线程安全
 */
public class HasSelfPrivateNum {
    private int num = 0;// 实例变量

    /* synchronized */public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);//此处获取的num可能出问题
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
