package test1;

public class student {
    private String name;
    private  int age;
    //构造方法
    public student(){} //无参构造
    public student(String name,int age){  //带参数构造
        this.name = name;
        this.age = age;
    }
    //成员方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name +","+ age);
    }
}

//成员变量和局部变量
//private关键字的使用
//this的使用
//数组的遍历