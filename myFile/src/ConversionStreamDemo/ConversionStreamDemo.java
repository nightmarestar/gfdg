package ConversionStreamDemo;

import java.io.*;
import java.util.Arrays;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myFile/src/ConversionStreamDemo/text.txt"));
        osw.write("代码");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("myFile/src/ConversionStreamDemo/text.txt"));
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("myFile/src/ConversionStreamDemo/text01.txt"));
        int ch;
        while ((ch = isr.read())!= -1){
            System.out.print((char)ch);
            osw2.write(ch);
        }

        isr.close();
        osw2.close();



    }
}
