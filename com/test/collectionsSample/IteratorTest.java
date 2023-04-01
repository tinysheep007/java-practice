package collectionsSample;

import java.util.*;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> li = new LinkedList<>(Arrays.asList("A","B","C"));
        Iterator<String> it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
        // we can only use one iterator once becasue usually the pointer would be at the end
        //and we cannot reverse the pointer

        //any class that implements iterable<>
        //as long as we override iterator.hasNext() and Next() function
        //we can use them later
    }
}
