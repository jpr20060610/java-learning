import java.util.LinkedHashMap;
import java.util.Map;

public class MapCount2 {
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "张三", "王五", "张三", "李四", "赵六"};
        Map<String,Integer> mapCount=new LinkedHashMap<>();
        int count=0;
        for (int i = 0; i < names.length; i++) {
            if (mapCount.containsKey(names[i])){
                count=mapCount.get(names[i]);
                mapCount.put(names[i],count+1);
            }else {
                mapCount.put(names[i],1);
            }
        }
        for(String key:mapCount.keySet()){
            System.out.println(key+"出现的次数是"+mapCount.get(key));
        }
        System.out.println("----------------------");
        for (Map.Entry<String,Integer> entry:mapCount.entrySet()){
            System.out.println(entry.getKey()+"出现的次数是"+entry.getValue());
        }
    }
}
