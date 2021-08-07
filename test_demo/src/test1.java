import java.sql.SQLOutput;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = theBigerNumber(x,y);
        System.out.println(z);

    }

    //定义一个方法，获取俩个数中的较大值，并返回参数
    public static int theBigerNumber(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    //判断一个数是否为偶数
    public static boolean isEvenNumber(int a){
        if(a%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    //获取最大数
    public static void getMax(int a,int b){
        System.out.println(a > b?a:b);
    }
    public static void maxSount(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x > y?x:y);

    }
}
