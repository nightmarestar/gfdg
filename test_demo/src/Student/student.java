package Student;
/*
    学生类
*/
public class student {
    //成员变量
    String name;
    int age;  //使用private修饰后student_demo类不运训调用

    //提供get、set方法
    public void setAge(int a){
        if(a < 0 || a > 120){
            System.out.println("您输入的年龄有误");
        }else{
            age = a;
        }
    }

    public int getAge(){
        return age;
    }

    //成员方法
    public void study(){
        System.out.println("学习");
    }
    public void doHomeWork(){
        System.out.println("做作业");
    }
}


