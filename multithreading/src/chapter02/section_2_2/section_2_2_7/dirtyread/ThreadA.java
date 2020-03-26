package chapter02.section_2_2.section_2_2_7.dirtyread;


public class ThreadA extends Thread {
    private MyList myList;

    public ThreadA(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            myList.add("threadA" + (i + 1));
        }
    }
}
