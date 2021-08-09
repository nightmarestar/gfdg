package CallNameDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myFile/src/CallNameDemo/name.txt"));
        ArrayList<String> array = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            array.add(line);
//            array.add(ch);
//            System.out.println();
        }


//        System.out.println(array);
        br.close();

//        Random r = new Random(0,array.size());
        Random r = new Random();
        int index = r.nextInt(array.size());
        String name = array.get(index);
        System.out.println(name);


//        int i = Random(0,array.size());

    }
}
