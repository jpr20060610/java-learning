import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCount {
    public static void main(String[] args) {
        String[] name={"张三","李四","张三","王五","张三"};
        Map<String,Integer> mapCount=new LinkedHashMap<>();
        int count=0;
        for (int i = 0; i < name.length; i++) {
            if(mapCount.containsKey(name[i])){
                count=mapCount.get(name[i]);
                mapCount.put(name[i],count+1);
            }else{
                mapCount.put(name[i],1);
            }
        }
        for(String key:mapCount.keySet()){
            System.out.println(key+"出现的次数是"+mapCount.get(key));
        }
        for (Map.Entry<String,Integer> entry:mapCount.entrySet()){
            System.out.println(entry.getKey()+"出现的次数是"+entry.getValue());
        }
    }
}
