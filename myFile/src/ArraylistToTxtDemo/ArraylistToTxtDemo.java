package ArraylistToTxtDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArraylistToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        array.add("唐三");
        array.add("萧炎");
        array.add("林动");
        array.add("牧尘");
        array.add("陈汉升");
        array.add("许七安");
        array.add("沈逸");
        array.add("徐凤年");
        array.add("宁长久");

        BufferedWriter bw = new BufferedWriter(new FileWriter("myFile/src/ArraylistToTxtDemo/txt.txt"));

        for (String s:array) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
