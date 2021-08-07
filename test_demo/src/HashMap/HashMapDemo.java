package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");

//        System.out.println(map);
//        System.out.println(map.get("001"));
        /*Set<String> keySet = map.keySet();
        System.out.println(keySet);*/
        Collection<String> values = map.values();
        System.out.println(values);


    }
}
