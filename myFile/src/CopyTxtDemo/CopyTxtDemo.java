package CopyTxtDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("myFile/src/CopyTxtDemo/fis02.txt");
        f.createNewFile();
        FileInputStream fis = new FileInputStream(f);
        int out;
        String str = "";
        while ((out = fis.read())!= -1){
            System.out.print((char)out);
            str += (char)out;
        }
        System.out.println();
//        System.out.println(str);
        FileOutputStream fos = new FileOutputStream("myFile/src/CopyTxtDemo/fos03.txt");
        fos.write(str.getBytes(StandardCharsets.UTF_8));

        fis.close();
        fos.close();
    }
}
