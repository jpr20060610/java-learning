import java.util.ArrayList;

public class MethodTest {
    public static void main(String[] args) {
        String s="Hello Wold";
        System.out.println(s.substring(0, 5));
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(" hi ".trim());
        System.out.println(String.valueOf(10)+1);
        System.out.println(s.contains("i"));
        System.out.println(s.toCharArray().length);

        ArrayList<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("bye");
        System.out.println(list.set(1, "hello"));
        System.out.println(list.indexOf("bye"));
        System.out.println(list.toArray());
    }
}
