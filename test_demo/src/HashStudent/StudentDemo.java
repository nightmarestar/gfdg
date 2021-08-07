package HashStudent;

import java.util.HashSet;

public class StudentDemo {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<Student> stu = new HashSet<>();

        //创建学生对象
        Student s1 = new Student("张三",10);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",30);
        Student s4 = new Student("赵六",50);

        //把学生添加到集合
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);

        //遍历集合（增强for循环）
        for (Student s:stu) {
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
