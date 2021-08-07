package test4;

public class TestDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
//        System.out.println(a.weight); //报错，因为Animal类中没有weight成员变量
        a.eat();
//        a.playGame();   //报错，因为Animal类中没有playGame方法
    }
}
