package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"jin");
        map.put(2,"me");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.entrySet().forEach(entry ->{
            System.out.println("key: "+entry.getKey());
            System.out.println("Val: "+entry.getValue());
        });

    }
    

}
