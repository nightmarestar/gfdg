import java.util.Scanner;



public class test2 {
//    public static void main(String[] args) {
//        int number = 100;
//        System.out.println("调用change方法前："+number); //输出：100
//        change(number);
//        System.out.println("调用change方法后："+number); //输出：100
//    }
//    public static void change(int arr[]){
//        arr[1] = 200;
//    }
//    public static void change(int number){
//        number = 200;
//    }


//    public static void main(String[] args) {
//        int arr[] = {10,20,30};
//        System.out.println("调用change方法前："+arr[1]); //输出：20
//        change(arr);
//        System.out.println("调用change方法后："+arr[1]); //输出：200
//    }
//    public static void change(int arr[]){
//        arr[1] = 200;
//    }

    /*public static void main(String[] args) {
        int arr[] = {1,2,5,7,23,75,24,64};
        int number = getTheMax(arr);
        System.out.println(number);
    }
    //定义一个方法用于获取数组中的最大值，调用方法并输出结果
    public static int getTheMax(int arr[]){
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }*/


    /*public static void main(String[] args) {
        int number = Fb();
        //System.out.println(number);

    }
    public static int Fb(){
        int arr[] = new int[20];
        arr[0] = 1;
        System.out.println("第1个月兔子有1只");
        arr[1] = 1;
        System.out.println("第2个月兔子有1只");
        for(int i = 2;i < 20;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println("第"+ (i+1) +"个月兔子有"+arr[i]+"只");
        }
        return arr[19];
    }*/


    public static void main(String[] args) {
        int[] arr = {12,33,34,77,65,82,26,85,36};
        for(int i = 0;i < arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i]; //ArrayIndexOutOfBoundsException 指针越界异常
            arr[arr.length - 1 - i] = temp;
        }
        printArray(arr);
        /*for(int i = 0,o = arr.length - 1;i < o;i++,o--){
            int temp = arr[i];
            arr[i] = arr[o];
            arr[o] = temp;
        }
        printArray(arr);*/

    }
    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }


}
