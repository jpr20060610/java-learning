import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountChars   {
    public static void main(String[] args) {
        String s = "programming";
        int count=0;
        Map<Character,Integer> mapCount=new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapCount.containsKey(s.charAt(i))){
                count=mapCount.get(s.charAt(i));
                mapCount.put(s.charAt(i),count+1);
            }else {
                mapCount.put(s.charAt(i),1);
            }
        }

        for (Character key:mapCount.keySet()){
            if (mapCount.get(key)==1){
                System.out.println("\"programming\" 里第一个只出现一次的字符:"+key);
                break;
            }
        }
        System.out.println("------------------------");
        for (Character key:mapCount.keySet()){
            System.out.println(key+"="+mapCount.get(key));
        }
        System.out.println("------------------------");
        for(Map.Entry<Character,Integer> entry:mapCount.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
