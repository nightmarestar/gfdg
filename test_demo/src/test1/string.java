package test1;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符：");
        String arr = sc.nextLine();
        System.out.println(arr);
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for(int i = 0;i < arr.length();i++){
            char ch = arr.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }
            if(ch >= 'a' && ch <= 'z'){
                smallCount++;
            }
            if(ch >= '0' && ch <= '9'){
                numberCount++;
            }
        }
        System.out.println("大写字符的数量为："+bigCount);
        System.out.println("小写字符的数量为："+smallCount);
        System.out.println("数字字符的数量为："+numberCount);
    }
}
