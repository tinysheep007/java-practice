package collectionsSample;

import java.util.*;

public class DequeueTest {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(5);
        q.offer(10);
        q.offer(-123);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        // we can use dequeue as stack and queue because
        // it has implementation of adding and removing from both fron and back
        Deque<String> bothWays = new LinkedList<>();
        bothWays.addFirst("asdasd");
        bothWays.addLast("last");
        bothWays.removeFirst();
        while(!bothWays.isEmpty()){
            System.out.println(bothWays.pop());
        }

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(100);
        pq.offer(0);
        pq.offer(-2);
        // they store in the same way as queue
        System.out.println(pq);
        // but they exit out in order of smallest to biggest
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        //if we want a pq that goes different way we can use
        Queue<Integer> pq2 = new PriorityQueue<>( (a, b) -> b-a);
        pq2.offer(20);
        pq2.offer(30);
        pq2.offer(35);
        System.out.println(pq2);
        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }
        //the acutal storage location is not stored in sequence of 
        //big to small or  small to big
        //when we do the poll(), we are just returning them in the requested sequence

    }
    

    
}
