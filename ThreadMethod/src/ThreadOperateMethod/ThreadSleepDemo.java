package ThreadOperateMethod;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("太微");
        ts2.setName("太一");
        ts3.setName("太昊");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
