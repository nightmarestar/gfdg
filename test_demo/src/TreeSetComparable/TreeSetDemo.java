package TreeSetComparable;


import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        
        Student s1 = new Student("张三",15);
        Student s2 = new Student("李四",16);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("赵六",17);
        Student s5 = new Student("钱七",17);
        System.out.println(s5.getClass().getName() + s5);
        Student s6 = new Student("钱七",17);
        System.out.println(s6);


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student stu:ts) {
            System.out.println(stu);
        }
    }
}
