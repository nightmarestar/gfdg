package ThreadOperateMethod;

public class ThreadDeamonDemo {
    public static void main(String[] args) {
        ThreadDeamon td1 = new ThreadDeamon();
        ThreadDeamon td2 = new ThreadDeamon();
        ThreadDeamon td3 = new ThreadDeamon();

        td1.setName("萧何");
        td2.setName("张良");
        td3.setName("韩信");
        Thread.currentThread().setName("刘邦");

        td1.setDaemon(true);
        td2.setDaemon(true);
        td3.setDaemon(true);

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"："+i);
        }


        td1.start();
        td2.start();
        td3.start();
    }

}
