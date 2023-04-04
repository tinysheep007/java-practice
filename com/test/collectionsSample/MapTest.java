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
        
        //linked hashmap means the sequence of when we insert is saved
        //in the structure 
        System.out.println("Linked Hash Map");
        Map<Integer, String> mapLL = new LinkedHashMap<>();
        mapLL.put(1, "LL jin");
        mapLL.put(2, "LL beater");
        mapLL.put(3, "LL andy");
        mapLL.forEach((k,v)->System.out.println(k+" "+v));

        //tree hash map is acutally a RB tree underneath
        //you can pass in comparator
        System.out.println("Tree Hash Map");
        Map<Integer, String> mapTr = new TreeMap<>((a,b) -> b-a);
        mapTr.put(2, "Tree jin");
        mapTr.put(3, "Tree beater");
        mapTr.put(1, "Tree andy");
        mapTr.forEach((k,v)->System.out.println(k+" "+v));
        
    // all different type of set are only using the same type of map but only the keys
    }
}
