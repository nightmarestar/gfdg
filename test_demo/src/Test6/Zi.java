package Test6;

public class Zi extends Fu{
    int age = 20;
    public Zi(){
        super(20);
        System.out.println("Zi中无参构造方法被调用");
    }
    public Zi(int age){
        super(age);
        System.out.println("Zi中带参构造方法被调用");
    }
   /* public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }*/

}
