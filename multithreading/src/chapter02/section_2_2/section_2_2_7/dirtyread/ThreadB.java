package chapter02.section_2_2.section_2_2_7.dirtyread;

public class ThreadB extends Thread {
    private MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            myList.add("threadB" + (i + 1));
        }
    }
}
