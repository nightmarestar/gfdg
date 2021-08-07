package CopyAviDemo;

import java.io.*;
import java.util.Arrays;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException{
        /*四种方式实现复制视频，并记录每种方式所消耗的时间
        * 1：基本字节流一次读写一个字节            共耗时：5813毫秒
        * 2：基本字节流一次读写一个字节数组         共耗时：16毫秒
        * 3：字节缓冲流一次读写一个字节            共耗时：77毫秒
        * 4：字节缓冲流一次读写一个字节数组        共耗时：11毫秒
         */
        long startTime = System.currentTimeMillis();

//        method1();
        method2();
//        method3();
//        method4();

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时："+(endTime-startTime)+"毫秒");
    }
//    1：基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("myFile/src/CopyAviDemo/map.jpg");
        FileOutputStream fos = new FileOutputStream("myFile/src/CopyAviDemo/mapCopy.jpg");
        int by;
        while ((by = fis.read())!= -1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

//    2：基本字节流一次读写一个字节数组
    public static void method2() throws IOException{
        FileInputStream fis = new FileInputStream("myFile/src/CopyAviDemo/map.jpg");
        FileOutputStream fos = new FileOutputStream("myFile/src/CopyAviDemo/mapCopy.jpg");
        byte byt[] = new byte[8192];
        int by;
        while ((by = fis.read(byt))!= -1){
//            System.out.println(Arrays.toString(byt));
//            System.out.println(byt.length);
//            System.out.println(by);
            fos.write(byt,0,by);
        }
        fis.close();
        fos.close();
    }

//    3：字节缓冲流一次读写一个字节
    public static void method3() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myFile/src/CopyAviDemo/map.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myFile/src/CopyAviDemo/mapCopy.jpg"));
        int by;
        while ((by = bis.read())!= -1){
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

//    4：字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myFile/src/CopyAviDemo/map.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myFile/src/CopyAviDemo/mapCopy.jpg"));
        byte byt[] = new byte[8192];
        int by;
        while ((by = bis.read(byt))!= -1){
            bos.write(byt,0,by);
        }
        bis.close();
        bos.close();
    }



}
