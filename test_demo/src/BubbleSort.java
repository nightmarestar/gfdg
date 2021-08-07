import java.util.Objects;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12,22,35,17,46,37,26,96,45,81};
//        System.out.println(arrayToString(arr));
        bubbleSort(arr);
        printOut(arr);
    }

    public static void bubbleSort(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //return arr;
    }

    public static void printOut(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}
