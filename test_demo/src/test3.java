import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        System.out.println("请输入6个0～100之间的分数");
        //输出成绩
        for(int i = 0;i < 6;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入第"+(i+1)+"个数：");
            int temp = sc.nextInt();
            if(temp >= 0 && temp <= 100){
                arr[i] = temp;
            }else{
                System.out.println("你输入的成绩有误");
                break;
            }
        }
        //处理成绩
        int max = getMax(arr);
        System.out.println("最高分数为："+max);
        int min = getMin(arr);
        System.out.println("最低分数为："+min);
        int sum = getSum(arr);
        int finalScore = (sum - max - min)/4;
        System.out.println("去掉高分和最低分后，最终成绩为："+finalScore);

    }
    //求最高分
    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i = 0;i < 6;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    //求最低分
    public static int getMin(int arr[]){
        int min = arr[0];
        for(int i = 0;i < 6;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    //求总分
    public static int getSum(int arr[]){
        int sum = 0;
        for(int i = 0;i < 6;i++){
            sum += arr[i];
        }
        return sum;
    }


}
