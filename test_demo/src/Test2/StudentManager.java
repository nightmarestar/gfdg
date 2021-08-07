package Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        //实现程序主界面
        System.out.println("——————————欢迎来到学生管理系统————————————");
        System.out.println("1：添加学生");
        System.out.println("2：修改学生");
        System.out.println("3：删除学生");
        System.out.println("4：查看所有学生");
        System.out.println("5：退出");

        while(true){
            //用Scanner实现键盘输入数据
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入你要进行的操作：");
            int chose = sc.nextInt();

            //用switch语句实现选择操作
            switch (chose){
                case 1:
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case 2:
                    System.out.println("修改学生");
                    alterStudent(array);
                    break;
                case 3:
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case 4:
                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    System.exit(0);  //JVM退出
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> array){
        //键盘录入信息
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生住址：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        //将学生对象添加到集合中
        array.add(student);
        System.out.println("添加成功");
    }

    //修改学生
    public static void alterStudent(ArrayList<Student> array){
        //选择要修改的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的学生学号：");
        String sid = sc.nextLine();
        int flag = 0;

        //遍历所有学生学号
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            String id = s.getSid();
            if(id.equals(sid)){
                //选择修改的项目：学号｜姓名｜年龄｜住址
                System.out.println("搜寻到学号，请输入要修改的项目：学号｜姓名｜年龄｜住址");
                String alter = sc.nextLine();  //输入修改项目
                Student stu = new Student();   //创建新的学生对象
                switch (alter){                //alter：修改项目
                    case "学号":
                        System.out.print("输入修改后学号：");
                        String alterSid = sc.nextLine();
                        //创建新的学生对象
                        stu.setSid(alterSid);
                        stu.setName(s.getName());
                        stu.setAge(s.getAge());
                        stu.setAddress(s.getAddress());
                        //使用新的学生对象替换旧的学生对象
                        array.set(i,stu);
                        flag = 1;
                        break;
                    case "姓名":
                        System.out.print("输入修改后姓名：");
                        String alterName = sc.nextLine();
//                        //创建新的学生对象
//                        Student stu2 = new Student();
                        stu.setSid(s.getSid());
                        stu.setName(alterName);
                        stu.setAge(s.getAge());
                        stu.setAddress(s.getAddress());
                        //使用新的学生对象替换旧的学生对象
                        array.set(i,stu);
                        flag = 1;
                        break;
                    case "年龄":
                        System.out.print("输入修改后年龄：");
                        String alterAge = sc.nextLine();
//                        //创建新的学生对象
//                        Student stu3 = new Student();
                        stu.setSid(s.getSid());
                        stu.setName(s.getName());
                        stu.setAge(alterAge);
                        stu.setAddress(s.getAddress());
                        //使用新的学生对象替换旧的学生对象
                        array.set(i,stu);
                        flag = 1;
                        break;
                    case "住址":
                        System.out.print("输入修改后住址：");
                        String alterAddress = sc.nextLine();
//                        //创建新的学生对象
//                        Student stu4 = new Student();
                        stu.setSid(s.getSid());
                        stu.setName(s.getName());
                        stu.setAge(s.getAge());
                        stu.setAddress(alterAddress);
                        //使用新的学生对象替换旧的学生对象
                        array.set(i,stu);
                        flag = 1;
                        break;
                    default:
                        System.out.println("输入错误，请重新输入！");
                        break;
                }
            }
        }
        if(flag == 0){
            System.out.println("学号错误，请重新输入！");
        }
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> array){
        //选择要删除的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的学生的学号：");
        String sid = sc.nextLine();
        int flag = 0;
        //遍历所有学生学号，得到索引
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            String id = s.getSid();
            if(id.equals(sid)){
                array.remove(i);
                flag = 1;
                System.out.println("删除成功");
            }
        }
        if(flag == 0){
            System.out.println("学号错误，请重新输入！");
        }
    }

    //查看学生
    public static void findAllStudent(ArrayList<Student> array){
        //查看表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t住址");
        //将集合中的数据取出按照对应格式显示
        for (int j = 0; j < array.size(); j++) {
            Student s = array.get(j);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }
}
