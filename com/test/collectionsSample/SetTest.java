package collectionsSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args){
        Set<String> set  = new HashSet<>();
        set.add("hello");
        set.add("what");
        // the sequence of our input is not the same sequnece as they store it
        System.out.println(set);
        //unless we use LinkedHashSet
        //this means the order which we store it's the same as our input
        Set<String> orderSet  = new LinkedHashSet<>();
        orderSet.add("hello");
        orderSet.add("what");
        System.out.println(orderSet);

        //using treeset     
        //from biggest to lowest by passing in comparator
        Set<Integer> preorderedSet = new TreeSet<>((a,b)->b-a);
        preorderedSet.add(5);
        preorderedSet.add(200);
        preorderedSet.add(0);
        System.out.println(preorderedSet);

    }
}
