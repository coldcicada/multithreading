package chapter02.section_2_2.section_2_2_4;


public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        Thread1 t1 = new Thread1(task);
        t1.start();
        Thread2 t2 = new Thread2(task);
        t2.start();
    }
}
