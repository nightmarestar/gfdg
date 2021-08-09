package ThreadOperateMethod;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("刘邦");
        tj2.setName("刘秀");
        tj3.setName("刘备");

        tj1.start();
        tj1.join();
        tj2.start();
        tj3.start();
    }
}
