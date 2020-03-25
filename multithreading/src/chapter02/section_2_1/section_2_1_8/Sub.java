package chapter02.section_2_1.section_2_1_8;

public class Sub extends Main {
    /**
     * 子类不会继承同步，所以要加synchronized
     */
    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName="
                    + Thread.currentThread().getName()
                    + " time="
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName="
                    + Thread.currentThread().getName()
                    + " time="
                    + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
