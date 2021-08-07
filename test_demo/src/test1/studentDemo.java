package test1;

public class studentDemo {
    public static void main(String[] args) {
        //使用无参构造方法创建对象后赋值
        student student1 = new student();
        student1.setName("李四");
        student1.setAge(16);
        student1.show();
        //使用带参构造方法直接创建带有属性值的对象
        student student = new student("张三",18);
        student.show();
    }
}
