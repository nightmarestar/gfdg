package SellTicket;

public class SellTicket implements Runnable{
    private int tickets = 100;

    @Override
    public void run() {
        while (true){
            if(tickets >= 0){
                System.out.println(Thread.currentThread().getName()+"卖出了一张票，剩余票数："+tickets);
                tickets -= 1;
            }else{
                System.out.println("票已经卖完了");
                break;
            }
        }

    }
}
