package Test9;

public class TestDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Cat j = new Cat();
        jo.useJumpping(j);
        j.jump();
    }
}
