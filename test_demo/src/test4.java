import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("World");
        array.add("LW");
        System.out.println(array);
        array.remove(2);
        System.out.println(array);
        array.add("Study");
        array.add("Java");
        System.out.println(array);
        array.set(3,"Python");
        System.out.println(array);
        System.out.println(array.get(2));
    }
}
