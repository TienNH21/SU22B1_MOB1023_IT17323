package buoi7_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map =
            new HashMap<String, Integer>();
        
        map.put("iphoneX",  7);
        map.put("iphone11", 15);
        map.put("iphone12", 20);
        map.put("iphone13", 25);

        System.out.println(map);

        map.put("iphoneX",  37);
        System.out.println(map);
        
        Set<String> keys = map.keySet();
        for (String key: keys) {
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
