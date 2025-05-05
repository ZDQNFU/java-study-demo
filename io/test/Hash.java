package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    //哈希Map遍历
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("语文","90");
        map.put("数学","80");
        map.put("英语","70");
        map.put("物理","89");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " = " + map.get(key));
        }



    }
}
