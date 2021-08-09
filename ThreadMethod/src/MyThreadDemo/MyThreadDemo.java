package MyThreadDemo;

public class MyThreadDemo {
    public static void main(String[] args) {
        RunMethod rm1 = new RunMethod();
        RunMethod rm2 = new RunMethod();

        rm1.setName("早饭");
        rm2.setName("晚饭");
//        rm1.run();
//        rm2.run();
        rm1.start();
        rm2.start();
    }
}
