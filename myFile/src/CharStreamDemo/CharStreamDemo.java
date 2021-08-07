package CharStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myFile/src/CharStreamDemo/text.txt"));
        char str[] = {'a','b','c','d','e'};
//        osw.write(str);
//        osw.write(str,0,3);
        osw.write("abcde",1,3);
        osw.flush();
        osw.close();
    }
}
