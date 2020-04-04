package chapter02.section_2_3.section_2_3_2;


/**
 * volatile解决同步死锁
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        //printStringService.printStringMethod();// 不用线程运行，main到此一直执行
        new Thread(printStringService).start();
        System.out.println("想要停止它！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}

