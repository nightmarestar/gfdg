package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hello world/fos02.txt");
        /*int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);*/

        /*int by = fis.read();
        System.out.print((char)by);
        while (by != -1){
            by = fis.read();
            System.out.print((char)by);
        }*/

        int by;
        while ((by = fis.read()) != -1){
            System.out.print((char)by);
        }

        fis.close();
    }
}
