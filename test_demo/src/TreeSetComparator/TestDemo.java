package TreeSetComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TestDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int sum = s1.getScore() - s2.getScore();
                return sum;
            }
        });

        Student s1 = new Student("张三",18,70,75,66);
        Student s2 = new Student("李四",19,74,73,68);
        Student s3 = new Student("王五",17,81,83,55);
        Student s4 = new Student("赵六",18,65,89,66);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student s:ts) {
            System.out.println(s.getName()+","+s.getAge()+"岁,语文："+s.getChinese()+",数学："+s.getMath()+",英语："+s.getEnglish()+",总分:"+s.getScore());
        }
    }
}
