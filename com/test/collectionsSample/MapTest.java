package collectionsSample;

import java.util.HashMap;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //key has to be unique
        map.put(1, "jin");
        map.put(2, "beater");
        map.put(3, "andy");
        System.out.println(map.get(2));
        System.out.println(map.containsValue("jin"));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getKey());
        });
        
    }
}
