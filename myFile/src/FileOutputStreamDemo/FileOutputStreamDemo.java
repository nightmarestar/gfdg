package FileOutputStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("hello world/fos02.txt");

        //使用write(int b)方法写入文件
        String str = "This is a new file";
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);
            fos.write(temp);
        }


        //使用write(byte[] b)方法写入文件
        /*String str = "This is a new file again";
        fos.write(str.getBytes(StandardCharsets.UTF_8));*/

        //使用write(byte[] b,int off,int len)方法写入文件
        /*String str = "This is a new file once again";
        fos.write(str.getBytes(StandardCharsets.UTF_8),11,10);
*/
        /*int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            fos.write(arr[i]);
        }*/
        //System.out.println(fos);



        /*fos.write(1);
        fos.write(13);
        fos.write(22);

        System.out.println(fos);
        System.out.println(fos.hashCode());
        System.out.println(fos.);*/

        fos.close();
    }
}
