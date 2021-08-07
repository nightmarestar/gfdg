package LinkedHashSet;

import java.util.LinkedHashSet;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<Student> ls = new LinkedHashSet<Student>();

        //创建学生对象
        Student s1 = new Student("张三",10);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",30);
        Student s4 = new Student("赵六",50);

        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);

        //遍历集合
        /*for (Student stu:ls) {
            System.out.println(stu.getName()+","+stu.getAge());
        }*/
        for (Student stu:ls) {
            System.out.println(stu);
        }

    }
}
