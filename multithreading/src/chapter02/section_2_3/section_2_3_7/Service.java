package chapter02.section_2_3.section_2_3_7;

/**
 * Created by baihan on 2020/4/4.
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun) {
            synchronized ("str") {

            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
