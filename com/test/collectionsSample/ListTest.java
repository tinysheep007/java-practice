package collectionsSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args){
        List<String> li = new ArrayList<>();
        li.add("bozo");
        li.add("ok");
        li.remove("ok");
        li.add("goofy");
        li.addAll(Arrays.asList("young","gpt","chad"));
        // the list came from asList can not be edited unless you put it within 
        // ArrayList<>(Arrays.asList("blah",...))
        // pure Arrays.asList() is only readable
        li.sort(String::compareTo);
        li.removeIf(a->a.length()==4);
        System.out.println(li);
        System.out.println(li.contains("bozo"));

        List<String> sl = new LinkedList<>();
        //same functionality but different implemenation like run time
        //it is a doubly linkedlist
        Iterator<String> it = li.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
    
}
