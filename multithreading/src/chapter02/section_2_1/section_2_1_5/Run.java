package chapter02.section_2_1.section_2_1_5;

public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            MyThread t = new MyThread(publicVar);
            t.start();
            Thread.sleep(200);// 打印结果受此值大小影响
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
