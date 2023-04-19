package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ParallelThreadTest {
    public static void main(String[] args) {
        List li = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //we notice that we are acessing all index in parallel instead of 
        //following the order
        li.parallelStream().forEach((i)->{
            System.out.println(Thread.currentThread().getName() + " Num: "+ i);
        });
    }
}
