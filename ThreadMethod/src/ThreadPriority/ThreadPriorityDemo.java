package ThreadPriority;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("飞机");
        tp2.setName("高铁");
        tp3.setName("火车");

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        tp1.setPriority(10);
        tp2.setPriority(5);
        tp3.setPriority(1);


        tp1.start();
        tp2.start();
        tp3.start();
    }
}
