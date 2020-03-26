package chapter02.section_2_2.section_2_2_7;

/**
 * 将任意对象多为对象监视器
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + " 在" + System.currentTimeMillis() + "进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("username:" + usernameParam + " password:" + passwordParam);
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + " 在" + System.currentTimeMillis() + "离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
