import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FileStreamDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte byt[] = s.getBytes("GB2312");
        System.out.println(Arrays.toString(byt));
        byte byt1[] = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(byt1));
        byte byt2[] = s.getBytes("Unicode");
        System.out.println(Arrays.toString(byt2));
    }
}
