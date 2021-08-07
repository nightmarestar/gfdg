import java.util.Scanner;


public class test2 {
    public static void main(String[] args){
        /*
        //创建变量
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入考试成绩：");
        int score = sc.nextInt();
        //逻辑判断
        if(score > 94 && score <= 100){
            System.out.println("奖励自行车");
        }else if(score > 89 && score <= 94){
            System.out.println("奖励游乐园门票");
        }else if(score > 84 && score <= 89){
            System.out.println("奖励玩偶");
        }else if(score > 79 && score <= 84){
            System.out.println("奖励书本");
        }else{
            System.out.println("没有奖励");
        }
         */

        /*
        for(int i = 0;i < 5;i++){
            System.out.println("HelloWorld");
        }
         */
        //int i = 371/100;
        //System.out.println(i);

        /*
        int count = 0;
        for(int i = 100;i <= 999;i++){
            int x = i/100;
            int y = (i/10)%10;
            int z = i%10;
            if(x*x*x+y*y*y+z*z*z == i){
                count = count + 1;
            }
        }
        System.out.println("水仙花数的数量为"+count+"个");
         */

        /*
        double i = 0.1;
        int count = 0;
        while(i < 8844430){
            i = i*2;
            count++;
        }
        System.out.println("需要折叠"+count+"次，此时纸张厚度为"+i+"毫米");
         */
        for(int h = 0;h < 24;h++){
            for(int m = 0;m <60;m++){
                System.out.println("现在是"+h+"时"+m+"分");
            }
        }



    }
}
