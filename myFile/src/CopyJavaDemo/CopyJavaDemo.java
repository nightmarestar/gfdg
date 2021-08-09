package CopyJavaDemo;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myFile/src/CharStreamDemo/CharStreamDemo.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myFile/src/CopyJavaDemo"));

        int ch;
        while ((ch=isr.read())!= -1){
            osw.write(ch);
        }

        isr.close();
        osw.close();
    }
}
