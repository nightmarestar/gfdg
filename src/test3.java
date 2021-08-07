import java.util.Random;
import java.util.Scanner;

public class test3 {
    /*
    public static void main(String[] args){
        //创建对象
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //获取随机数
        int i = r.nextInt(100)+1;

        do{
            System.out.print("请输入一个数字：");
            int o = sc.nextInt();
            if(o < i){
                System.out.println("你猜小了");
            }else if(o > i){
                System.out.println("你猜大了");
            }else if(o == i){
                System.out.println("恭喜，你猜对了！");
                break;
            }
        }while(true);
    }
     */
    /*
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int arr2[] = arr;
        arr2[0] = 133;
        arr2[1] = 233;
        arr2[2] = 333;

        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[1]);
    }
     */
    /*
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(arr.length);
        for(int i = 0;i < 10;i++){
            System.out.println(arr[i]);
        }
    }
     */
    public static void main(String[] args) {
        int arr[] = {1,22,17,35,16,48,27,37};
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中最大的数为："+max);
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("数组中最小的数为："+min);
    }


}
