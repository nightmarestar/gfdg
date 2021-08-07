package FileDemo01;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("myFile\\src\\FileDemo01\\f1.txt");
        f1.createNewFile();
        System.out.println(f1.getAbsoluteFile());
        boolean flag = f1.exists();
        System.out.println(flag);
        System.out.println(f1);


    }
}
