package HashMapStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Student> ms = new HashMap<>();
        Student s1 = new Student("张三",19);
        Student s2 = new Student("李四",18);
        Student s3 = new Student("王五",20);

        ms.put("001",s1);
        ms.put("002",s2);
        ms.put("003",s3);

        Set<String> keySet = ms.keySet();
        for (String str:keySet) {
            Student value = ms.get(str);
            System.out.println(str+":"+value.getName()+","+value.getAge());
        }

    }
}
