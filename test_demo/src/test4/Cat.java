package test4;

public class Cat extends Animal{
    public int age = 20;
    public int weight = 40;
    @Override
    public void eat() {
        System.out.println("猫喜欢吃鱼");
    }
    public void playGame(){
        System.out.println("猫猫球");
    }
}
