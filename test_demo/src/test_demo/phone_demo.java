package test_demo;

public class phone_demo {
    public static void main(String[] args) {
        phone p = new phone();
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "huawei";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
    }
}
