package Test7;

public class TestDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();
        a.setName("布偶猫");
        a.setAge(16);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
