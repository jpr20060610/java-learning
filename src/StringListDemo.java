import java.util.ArrayList;

public class StringListDemo {
    public static void main(String[] args) {
        // 1. 创建 ArrayList<String>，放入: Tom, Jerry, Spike, Tyke
        ArrayList<String> name=new ArrayList<>();
        name.add("Tom");
        name.add("Jerry");
        name.add("Spike");
        name.add("Tyke");
        // 2. 用 for 循环遍历：把长度超过 3 的名字，set 替换成 原名+"_long"
        //    （get 取出 → length() 判断 → set 替换）
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).length()>3){
                name.set(i,name.get(i)+"_long");
            }
        }
        // 3. 【老坑预警】删除所有以 'T' 开头的名字
        //    提示：正序删除为什么漏元素？你有几种解法？写一种就行
        for (int i = name.size(); i > 0; i--) {
            if(name.get(i-1).startsWith("T")){
                name.remove(i-1);
            }
        }
        // 4. 最后 for-each 打印剩余所有名字
        for (String s : name) {
            System.out.println(s);
        }
    }
}
