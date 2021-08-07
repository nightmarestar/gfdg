public class StrintSort {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] s1 = s.split(" ");
//        for (int i = 0; i < s1.length; i++) {
//            System.out.print(s1[i]+" ");
//        }
        int arr[] = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
