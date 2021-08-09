package CopyJavaDemo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myFile/src/CopyJpgDemo/CopyJpgDemo.java");
        FileWriter fw = new FileWriter("myFile/src/CopyDest/JpgCopy.java");

        /*int ch;
        while ((ch = fr.read())!= -1){
            fw.write(ch);
        }*/

        char[] chs = new char[1024];
        int ch;
        while ((ch = fr.read(chs))!= -1){
            fw.write(chs,0,ch);
        }

        fr.close();
        fw.close();
    }
}
