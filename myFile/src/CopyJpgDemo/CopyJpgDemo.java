package CopyJpgDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myFile/src/CopyJpgDemo/map.jpg");
        FileOutputStream fos = new FileOutputStream("myFile/src/CopyJpgDemo/mapCopy.jpg");
        byte[] bts = new byte[1024];
        int by;
        while ((by = fis.read(bts))!= -1){
            fos.write(bts,0,by);
        }
        System.out.println("复制成功");

        fis.close();
        fos.close();
    }
}
