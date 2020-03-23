package chapter01.section_1_3;

public class Run2 {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        //countOperate.start();
        Thread t1 = new Thread(countOperate);
        t1.setName("A");
        t1.start();
    }
}
