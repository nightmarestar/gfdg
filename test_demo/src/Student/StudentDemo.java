package Student;

public class StudentDemo {
    public static void main(String[] args) {
        student student = new student();
        System.out.println(student.name);
        System.out.println(student.age);
        student.name = "张三";
        student.age = 17;
        System.out.println(student.name);
        System.out.println(student.age);
        student.study();
        student.doHomeWork();
    }
}
