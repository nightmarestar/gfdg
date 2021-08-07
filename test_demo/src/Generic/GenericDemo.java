package Generic;

import java.util.*;

public class GenericDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("Hello");
        c.add("World");
        c.add("Java");

        Iterator it = c.iterator();
        while(it.hasNext()){
            /*Object obj = it.next();
            System.out.println(obj);*/
            String s = (String)it.next();
            System.out.println(s);
        }
    }
}
